package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class WindowItems extends soupply.java340.Packet
{

    public static final int ID = 20;

    public byte window;
    public soupply.java340.type.Slot[] slots;

    public WindowItems()
    {
    }

    public WindowItems(byte window, soupply.java340.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
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
