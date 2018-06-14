package soupply.java340.serverbound;

import java.util.*;
import soupply.util.*;

class CraftingBookData extends soupply.java340.Packet
{

    public int type;

    public CraftingBookData()
    {
    }

    public CraftingBookData(int type)
    {
        this.type = type;
    }

}
