package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class CraftingData extends soupply.bedrock.Packet
{

    public static final int ID = 52;

    public soupply.bedrock.type.Recipe[] recipes;

    public CraftingData()
    {
    }

    public CraftingData(soupply.bedrock.type.Recipe[] recipes)
    {
        this.recipes = recipes;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
