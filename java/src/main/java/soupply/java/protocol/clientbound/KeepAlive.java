package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class KeepAlive extends soupply.java.Packet
{

    public static final int ID = 31;

    public long id;

    public KeepAlive()
    {
    }

    public KeepAlive(long id)
    {
        this.id = id;
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
