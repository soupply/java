package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class HeldItemChange extends soupply.java.Packet
{

    public static final int ID = 58;

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
