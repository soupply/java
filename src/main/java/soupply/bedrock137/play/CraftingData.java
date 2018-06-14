package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class CraftingData extends soupply.bedrock137.Packet
{

    public soupply.bedrock137.type.Recipe[] recipes;

    public CraftingData()
    {
    }

    public CraftingData(soupply.bedrock137.type.Recipe[] recipes)
    {
        this.recipes = recipes;
    }

}
