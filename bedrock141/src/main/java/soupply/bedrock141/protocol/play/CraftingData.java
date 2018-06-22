package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class CraftingData extends soupply.bedrock141.Packet
{

    public static final int ID = 52;

    public soupply.bedrock141.type.Recipe[] recipes;

    public CraftingData()
    {
    }

    public CraftingData(soupply.bedrock141.type.Recipe[] recipes)
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
        for(soupply.bedrock141.type.Recipe cvabc:recipes)
        {
            cvabc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bjylzm = _buffer.readVaruint();
        recipes = new soupply.bedrock141.type.Recipe[bjylzm];
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
