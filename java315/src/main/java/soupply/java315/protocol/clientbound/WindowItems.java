package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class WindowItems extends soupply.java315.Packet
{

    public static final int ID = 20;

    public byte window;
    public soupply.java315.type.Slot[] slots;

    public WindowItems()
    {
    }

    public WindowItems(byte window, soupply.java315.type.Slot[] slots)
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
