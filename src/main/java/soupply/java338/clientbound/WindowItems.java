package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class WindowItems extends soupply.java338.Packet
{

    public byte window;
    public soupply.java338.type.Slot[] slots;

    public WindowItems()
    {
    }

    public WindowItems(byte window, soupply.java338.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

}
