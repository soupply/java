package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class WindowItems extends soupply.java340.Packet
{

    public byte window;
    public soupply.java340.type.Slot[] slots;

    public WindowItems()
    {
    }

    public WindowItems(byte window, soupply.java340.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

}
