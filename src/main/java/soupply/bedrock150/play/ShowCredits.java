package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class ShowCredits extends soupply.bedrock150.Packet
{

    // status
    public static final int START = 0;
    public static final int END = 1;

    public long entityId;
    public int status;

    public ShowCredits()
    {
    }

    public ShowCredits(long entityId, int status)
    {
        this.entityId = entityId;
        this.status = status;
    }

}
