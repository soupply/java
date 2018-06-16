package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class TabComplete extends soupply.java338.Packet
{

    public static final int ID = 14;

    public String[] matches;

    public TabComplete()
    {
    }

    public TabComplete(String[] matches)
    {
        this.matches = matches;
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
