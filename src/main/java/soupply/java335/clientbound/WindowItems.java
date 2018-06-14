package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class WindowItems extends soupply.java335.Packet
{

    public byte window;
    public soupply.java335.type.Slot[] slots;

    public WindowItems()
    {
    }

    public WindowItems(byte window, soupply.java335.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

}
