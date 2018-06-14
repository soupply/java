package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class CombatEvent extends soupply.java338.Packet
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
