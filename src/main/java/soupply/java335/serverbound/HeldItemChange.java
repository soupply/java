package soupply.java335.serverbound;

import java.util.*;
import soupply.util.*;

class HeldItemChange extends soupply.java335.Packet
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
