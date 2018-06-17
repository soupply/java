package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class CraftingData extends soupply.bedrock261.Packet
{

    public static final int ID = 52;

    public soupply.bedrock261.type.Recipe[] recipes;

    public CraftingData()
    {
    }

    public CraftingData(soupply.bedrock261.type.Recipe[] recipes)
    {
        this.recipes = recipes;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)recipes.length);
        for(soupply.bedrock261.type.Recipe cvabc:recipes)
        {
            cvabc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bjylzm = _buffer.readVaruint();
        for(int cvabc=0;cvabc<recipes.length;cvabc++)
        {
            recipes[cvabc].decodeBody(_buffer);
        }
    }

    public static CraftingData fromBuffer(byte[] buffer)
    {
        CraftingData packet = new CraftingData();
        packet.safeDecode(buffer);
        return packet;
    }

}
