package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class TelemetryEvent extends soupply.bedrock201.Packet
{

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

}
