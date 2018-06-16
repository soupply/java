package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class TabComplete extends soupply.java.Packet
{

    public static final int ID = 1;

    public String text;
    public boolean command;
    public boolean hasPosition;
    public long block;

    public TabComplete()
    {
    }

    public TabComplete(String text, boolean command, boolean hasPosition, long block)
    {
        this.text = text;
        this.command = command;
        this.hasPosition = hasPosition;
        this.block = block;
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
