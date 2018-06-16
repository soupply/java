package soupply.java315.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class CloseWindow extends soupply.java315.Packet
{

    public static final int ID = 8;

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
