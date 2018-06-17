package soupply.java210.protocol.status;

import java.util.*;
import soupply.util.*;

public class Latency extends soupply.java210.Packet
{

    public static final int ID = 1;

    public long id;

    public Latency()
    {
    }

    public Latency(long id)
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
