package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class TimeUpdate extends soupply.java340.Packet
{

    public static final int ID = 71;

    public long worldAge;
    public long time;

    public TimeUpdate()
    {
    }

    public TimeUpdate(long worldAge, long time)
    {
        this.worldAge = worldAge;
        this.time = time;
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
