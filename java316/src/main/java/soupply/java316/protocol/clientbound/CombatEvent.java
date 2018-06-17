package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class CombatEvent extends soupply.java316.Packet
{

    public static final int ID = 44;

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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
