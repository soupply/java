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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
