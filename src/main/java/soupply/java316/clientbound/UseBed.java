package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class UseBed extends soupply.java316.Packet
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
