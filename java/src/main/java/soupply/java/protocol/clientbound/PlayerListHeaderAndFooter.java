package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class PlayerListHeaderAndFooter extends soupply.java.Packet
{

    public static final int ID = 74;

    public String header;
    public String footer;

    public PlayerListHeaderAndFooter()
    {
    }

    public PlayerListHeaderAndFooter(String header, String footer)
    {
        this.header = header;
        this.footer = footer;
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