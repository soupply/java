package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class CombatEvent extends soupply.java316.Packet
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
