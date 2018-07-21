package soupply.java393.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class QueryBlockNbt extends soupply.java393.Packet
{

    public static final int ID = 1;

    public int transationId;
    public long location;

    public QueryBlockNbt()
    {
    }

    public QueryBlockNbt(int transationId, long location)
    {
        this.transationId = transationId;
        this.location = location;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(transationId);
        _buffer.writeBigEndianLong(location);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        transationId = _buffer.readVaruint();
        location = _buffer.readBigEndianLong();
    }

    public static QueryBlockNbt fromBuffer(byte[] buffer)
    {
        QueryBlockNbt packet = new QueryBlockNbt();
        packet.safeDecode(buffer);
        return packet;
    }

}
