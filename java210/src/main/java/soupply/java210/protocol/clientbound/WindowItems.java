package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class WindowItems extends soupply.java210.Packet
{

    public static final int ID = 20;

    public byte window;
    public soupply.java210.type.Slot[] slots;

    public WindowItems()
    {
    }

    public WindowItems(byte window, soupply.java210.type.Slot[] slots)
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
