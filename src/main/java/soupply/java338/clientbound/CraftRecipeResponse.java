package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class CraftRecipeResponse extends soupply.java338.Packet
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
