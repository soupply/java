package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class CraftingData extends soupply.bedrock150.Packet
{

    public soupply.bedrock150.type.Recipe[] recipes;

    public CraftingData()
    {
    }

    public CraftingData(soupply.bedrock150.type.Recipe[] recipes)
    {
        this.recipes = recipes;
    }

}
