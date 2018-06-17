package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class TimeUpdate extends soupply.java.Packet
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianLong(worldAge);
        _buffer.writeBigEndianLong(time);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        worldAge = _buffer.readBigEndianLong();
        time = _buffer.readBigEndianLong();
    }

    public static TimeUpdate fromBuffer(byte[] buffer)
    {
        TimeUpdate packet = new TimeUpdate();
        packet.safeDecode(buffer);
        return packet;
    }

}
