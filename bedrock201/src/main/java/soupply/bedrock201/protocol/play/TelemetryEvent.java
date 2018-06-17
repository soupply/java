package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class TelemetryEvent extends soupply.bedrock201.Packet
{

    public static final int ID = 65;

    public long entityId;
    public int eventId;

    public TelemetryEvent()
    {
    }

    public TelemetryEvent(long entityId, int eventId)
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

    public static TelemetryEvent fromBuffer(byte[] buffer)
    {
        TelemetryEvent packet = new TelemetryEvent();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
