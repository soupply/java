package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class WindowItems extends soupply.java335.Packet
{

    public static final int ID = 20;

    public byte window;
    public soupply.java335.type.Slot[] slots;

    public WindowItems()
    {
        this.slots = new soupply.java335.type.Slot[]();
    }

    public WindowItems(byte window, soupply.java335.type.Slot[] slots)
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