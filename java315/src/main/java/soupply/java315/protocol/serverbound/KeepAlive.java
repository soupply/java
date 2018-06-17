package soupply.java315.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class KeepAlive extends soupply.java315.Packet
{

    public static final int ID = 11;

    public int id;

    public KeepAlive()
    {
    }

    public KeepAlive(int id)
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
