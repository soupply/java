package soupply.java338.serverbound;

import java.util.*;
import soupply.util.*;

class CraftRecipeRequest extends soupply.java338.Packet
{

    public byte window;
    public int recipe;
    public boolean makeAll;

    public CraftRecipeRequest()
    {
    }

    public CraftRecipeRequest(byte window, int recipe, boolean makeAll)
    {
        this.window = window;
        this.recipe = recipe;
        this.makeAll = makeAll;
    }

}
