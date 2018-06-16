package soupply.java316.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class HeldItemChange extends soupply.java316.Packet
{

    public static final int ID = 23;

    public short slot;

    public HeldItemChange()
    {
    }

    public HeldItemChange(short slot)
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
