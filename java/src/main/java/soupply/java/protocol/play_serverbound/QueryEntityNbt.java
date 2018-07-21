package soupply.java.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class QueryEntityNbt extends soupply.java.Packet
{

    public static final int ID = 12;

    public int transactionId;
    public int entityId;

    public QueryEntityNbt()
    {
    }

    public QueryEntityNbt(int transactionId, int entityId)
    {
        this.transactionId = transactionId;
        this.entityId = entityId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(transactionId);
        _buffer.writeVaruint(entityId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        transactionId = _buffer.readVaruint();
        entityId = _buffer.readVaruint();
    }

    public static QueryEntityNbt fromBuffer(byte[] buffer)
    {
        QueryEntityNbt packet = new QueryEntityNbt();
        packet.safeDecode(buffer);
        return packet;
    }

}
