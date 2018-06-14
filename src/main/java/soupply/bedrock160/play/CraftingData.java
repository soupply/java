package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class CraftingData extends soupply.bedrock160.Packet
{

    public soupply.bedrock160.type.Recipe[] recipes;

    public CraftingData()
    {
    }

    public CraftingData(soupply.bedrock160.type.Recipe[] recipes)
    {
        this.recipes = recipes;
    }

}
