package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class BossEvent extends soupply.bedrock150.Packet
{

    // event id
    public static final int ADD = 0;
    public static final int UPDATE = 1;
    public static final int REMOVE = 2;

    public long entityId;
    public int eventId;

    public BossEvent()
    {
    }

    public BossEvent(long entityId, int eventId)
    {
        this.entityId = entityId;
        this.eventId = eventId;
    }

}
