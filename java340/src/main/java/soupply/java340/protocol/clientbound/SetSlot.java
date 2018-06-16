package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class SetSlot extends soupply.java340.Packet
{

    public static final int ID = 22;

    public byte window;
    public short slot;
    public soupply.java340.type.Slot item;

    public SetSlot()
    {
        this.item = new soupply.java340.type.Slot();
    }

    public SetSlot(byte window, short slot, soupply.java340.type.Slot item)
    {
        this.window = window;
        this.slot = slot;
        this.item = item;
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
