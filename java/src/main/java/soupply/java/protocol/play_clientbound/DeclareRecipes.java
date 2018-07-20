package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class DeclareRecipes extends soupply.java.Packet
{

    public static final int ID = 84;

    public soupply.java.type.Recipe[] recipes;

    public DeclareRecipes()
    {
    }

    public DeclareRecipes(soupply.java.type.Recipe[] recipes)
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
        for(soupply.java.type.Recipe cvabc:recipes)
        {
            cvabc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bjylzm = _buffer.readVaruint();
        recipes = new soupply.java.type.Recipe[bjylzm];
        for(int cvabc=0;cvabc<recipes.length;cvabc++)
        {
            recipes[cvabc].decodeBody(_buffer);
        }
    }

    public static DeclareRecipes fromBuffer(byte[] buffer)
    {
        DeclareRecipes packet = new DeclareRecipes();
        packet.safeDecode(buffer);
        return packet;
    }

}
