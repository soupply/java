package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class Event extends soupply.bedrock261.Packet
{

    public static final int ID = 65;

    public long entityId;
    public int eventId;

    public Event()
    {
    }

    public Event(long entityId, int eventId)
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
        _buffer.writeVarint(eventId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        eventId = _buffer.readVarint();
    }

    public static Event fromBuffer(byte[] buffer)
    {
        Event packet = new Event();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
