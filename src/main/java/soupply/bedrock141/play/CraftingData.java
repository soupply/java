package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class CraftingData extends soupply.bedrock141.Packet
{

    public soupply.bedrock141.type.Recipe[] recipes;

    public CraftingData()
    {
    }

    public CraftingData(soupply.bedrock141.type.Recipe[] recipes)
    {
        this.recipes = recipes;
    }

}
