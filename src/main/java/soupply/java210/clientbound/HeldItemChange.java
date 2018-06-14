package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class HeldItemChange extends soupply.java210.Packet
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
