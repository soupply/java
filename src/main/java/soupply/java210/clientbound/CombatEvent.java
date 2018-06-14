package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class CombatEvent extends soupply.java210.Packet
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
