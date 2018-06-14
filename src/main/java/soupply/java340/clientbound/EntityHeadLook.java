package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class EntityHeadLook extends soupply.java340.Packet
{

    public int entityId;
    public byte headYaw;

    public EntityHeadLook()
    {
    }

    public EntityHeadLook(int entityId, byte headYaw)
    {
        this.entityId = entityId;
        this.headYaw = headYaw;
    }

}
