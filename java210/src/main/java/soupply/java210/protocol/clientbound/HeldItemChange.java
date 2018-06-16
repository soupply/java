package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class HeldItemChange extends soupply.java210.Packet
{

    public static final int ID = 55;

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
