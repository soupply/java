package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class WindowItems extends soupply.java315.Packet
{

    public byte window;
    public soupply.java315.type.Slot[] slots;

    public WindowItems()
    {
    }

    public WindowItems(byte window, soupply.java315.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

}
