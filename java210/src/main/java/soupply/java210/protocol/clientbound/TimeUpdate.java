package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class TimeUpdate extends soupply.java210.Packet
{

    public static final int ID = 68;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
