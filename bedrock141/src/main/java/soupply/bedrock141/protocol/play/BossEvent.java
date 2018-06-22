package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class BossEvent extends soupply.bedrock141.Packet
{

    public static final int ID = 74;

    // event id
    public static final int ADD = (int)0;
    public static final int UPDATE = (int)1;
    public static final int REMOVE = (int)2;

    public long entityId;
    public int eventId;

    public BossEvent()
    {
    }

    public BossEvent(long entityId, int eventId)
    {
        this.entityId = entityId;
        this.eventId = eventId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
        _buffer.writeVaruint(eventId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVarlong();
        eventId = _buffer.readVaruint();
    }

    public static BossEvent fromBuffer(byte[] buffer)
    {
        BossEvent packet = new BossEvent();
        packet.safeDecode(buffer);
        return packet;
    }

}
