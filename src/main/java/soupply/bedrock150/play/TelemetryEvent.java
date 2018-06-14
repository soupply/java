package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class TelemetryEvent extends soupply.bedrock150.Packet
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
