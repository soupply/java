package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class CombatEvent extends soupply.java340.Packet
{

    public byte eventId;

    public CombatEvent()
    {
    }

    public CombatEvent(byte eventId)
    {
        this.eventId = eventId;
    }

}
