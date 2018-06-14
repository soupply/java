package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class SetSlot extends soupply.java335.Packet
{

    public byte window;
    public short slot;
    public soupply.java335.type.Slot item;

    public SetSlot()
    {
    }

    public SetSlot(byte window, short slot, soupply.java335.type.Slot item)
    {
        this.window = window;
        this.slot = slot;
        this.item = item;
    }

}
