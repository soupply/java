package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class HeldItemChange extends soupply.java315.Packet
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
