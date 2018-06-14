package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class CraftingData extends soupply.bedrock201.Packet
{

    public soupply.bedrock201.type.Recipe[] recipes;

    public CraftingData()
    {
    }

    public CraftingData(soupply.bedrock201.type.Recipe[] recipes)
    {
        this.recipes = recipes;
    }

}
