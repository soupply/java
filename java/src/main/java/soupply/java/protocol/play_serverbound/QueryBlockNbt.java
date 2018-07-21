package soupply.java.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class QueryBlockNbt extends soupply.java.Packet
{

    public static final int ID = 1;

    public int transationId;
    public soupply.java.type.Position location;

    public QueryBlockNbt()
    {
        this.location = new soupply.java.type.Position();
    }

    public QueryBlockNbt(int transationId, soupply.java.type.Position location)
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
        location.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        transationId = _buffer.readVaruint();
        location.decodeBody(_buffer);
    }

    public static QueryBlockNbt fromBuffer(byte[] buffer)
    {
        QueryBlockNbt packet = new QueryBlockNbt();
        packet.safeDecode(buffer);
        return packet;
    }

}
