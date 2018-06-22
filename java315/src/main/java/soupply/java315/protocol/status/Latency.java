package soupply.java315.protocol.status;

import java.util.*;
import soupply.util.*;

public class Latency extends soupply.java315.Packet
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianLong(id);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        id = _buffer.readBigEndianLong();
    }

    public static Latency fromBuffer(byte[] buffer)
    {
        Latency packet = new Latency();
        packet.safeDecode(buffer);
        return packet;
    }

}
