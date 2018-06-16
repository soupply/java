package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class KeepAlive extends soupply.java335.Packet
{

    public static final int ID = 31;

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
    public void decodeBody(Buffer buffer)
    {
    }

}
