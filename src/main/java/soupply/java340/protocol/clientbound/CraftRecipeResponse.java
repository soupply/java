package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class CraftRecipeResponse extends soupply.java340.Packet
{

    public static final int ID = 43;

    public byte window;
    public int recipe;

    public CraftRecipeResponse()
    {
    }

    public CraftRecipeResponse(byte window, int recipe)
    {
        this.window = window;
        this.recipe = recipe;
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
