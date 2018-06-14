package soupply.java340.serverbound;

import java.util.*;
import soupply.util.*;

class HeldItemChange extends soupply.java340.Packet
{

    public short slot;

    public HeldItemChange()
    {
    }

    public HeldItemChange(short slot)
    {
        this.slot = slot;
    }

}
