package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class CraftingData extends soupply.bedrock150.Packet
{

    public static final int ID = 52;

    public soupply.bedrock150.type.Recipe[] recipes;

    public CraftingData()
    {
        this.recipes = new soupply.bedrock150.type.Recipe[]();
    }

    public CraftingData(soupply.bedrock150.type.Recipe[] recipes)
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
