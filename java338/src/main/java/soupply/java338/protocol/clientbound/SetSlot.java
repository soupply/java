package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SetSlot extends soupply.java338.Packet
{

    public static final int ID = 22;

    public byte window;
    public short slot;
    public soupply.java338.type.Slot item;

    public SetSlot()
    {
        this.item = new soupply.java338.type.Slot();
    }

    public SetSlot(byte window, short slot, soupply.java338.type.Slot item)
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
