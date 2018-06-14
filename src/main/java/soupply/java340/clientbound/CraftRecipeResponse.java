package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class CraftRecipeResponse extends soupply.java340.Packet
{

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

}
