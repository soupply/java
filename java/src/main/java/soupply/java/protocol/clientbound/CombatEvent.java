package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class CombatEvent extends soupply.java.Packet
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
