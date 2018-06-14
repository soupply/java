package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class CombatEvent extends soupply.java315.Packet
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
