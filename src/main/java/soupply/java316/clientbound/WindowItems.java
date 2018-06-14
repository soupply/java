package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class WindowItems extends soupply.java316.Packet
{

    public byte window;
    public soupply.java316.type.Slot[] slots;

    public WindowItems()
    {
    }

    public WindowItems(byte window, soupply.java316.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

}
