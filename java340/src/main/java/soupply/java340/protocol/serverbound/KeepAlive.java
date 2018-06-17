package soupply.java340.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class KeepAlive extends soupply.java340.Packet
{

    public static final int ID = 11;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
