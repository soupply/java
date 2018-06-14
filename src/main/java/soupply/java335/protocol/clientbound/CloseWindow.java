package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class CloseWindow extends soupply.java335.Packet
{

    public static final int ID = 18;

    public byte window;

    public CloseWindow()
    {
    }

    public CloseWindow(byte window)
    {
        this.window = window;
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
