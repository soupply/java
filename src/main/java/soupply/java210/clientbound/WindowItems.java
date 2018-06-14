package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class WindowItems extends soupply.java210.Packet
{

    public byte window;
    public soupply.java210.type.Slot[] slots;

    public WindowItems()
    {
    }

    public WindowItems(byte window, soupply.java210.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

}
