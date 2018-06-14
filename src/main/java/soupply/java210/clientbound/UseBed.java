package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class UseBed extends soupply.java210.Packet
{

    public int entityId;
    public long position;

    public UseBed()
    {
    }

    public UseBed(int entityId, long position)
    {
        this.entityId = entityId;
        this.position = position;
    }

}
