package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class OpenWindow extends soupply.java.Packet
{

    public static final int ID = 19;

    public byte window;
    public String type;
    public String title;
    public byte slots;

    public OpenWindow()
    {
    }

    public OpenWindow(byte window, String type, String title, byte slots)
    {
        this.window = window;
        this.type = type;
        this.title = title;
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
