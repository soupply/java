package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class CombatEvent extends soupply.java338.Packet
{

    public static final int ID = 45;

    public byte eventId;

    public CombatEvent()
    {
    }

    public CombatEvent(byte eventId)
    {
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
        _buffer.writeByte(eventId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        eventId = _buffer.readByte();
    }

    public static CombatEvent fromBuffer(byte[] buffer)
    {
        CombatEvent packet = new CombatEvent();
        packet.safeDecode(buffer);
        return packet;
    }

}
