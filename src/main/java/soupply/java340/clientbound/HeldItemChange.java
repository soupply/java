package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class HeldItemChange extends soupply.java340.Packet
{

    public byte slot;

    public HeldItemChange()
    {
    }

    public HeldItemChange(byte slot)
    {
        this.slot = slot;
    }

}
