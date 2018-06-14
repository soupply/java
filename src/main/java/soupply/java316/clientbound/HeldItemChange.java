package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class HeldItemChange extends soupply.java316.Packet
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
