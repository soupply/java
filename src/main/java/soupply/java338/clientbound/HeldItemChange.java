package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class HeldItemChange extends soupply.java338.Packet
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
