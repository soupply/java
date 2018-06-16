package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class HeldItemChange extends soupply.java335.Packet
{

    public static final int ID = 57;

    public byte slot;

    public HeldItemChange()
    {
    }

    public HeldItemChange(byte slot)
    {
        this.slot = slot;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
