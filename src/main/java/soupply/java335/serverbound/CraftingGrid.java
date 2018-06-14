package soupply.java335.serverbound;

import java.util.*;
import soupply.util.*;

class CraftingGrid extends soupply.java335.Packet
{

    public byte window;
    public short action;
    public soupply.java335.type.Entry[] returnEntry;
    public soupply.java335.type.Entry[] prepareEntry;

    public CraftingGrid()
    {
    }

    public CraftingGrid(byte window, short action, soupply.java335.type.Entry[] returnEntry, soupply.java335.type.Entry[] prepareEntry)
    {
        this.window = window;
        this.action = action;
        this.returnEntry = returnEntry;
        this.prepareEntry = prepareEntry;
    }

}
