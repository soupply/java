package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class EntityTeleport extends soupply.java315.Packet
{

    public int entityId;
    public Tuples.DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public boolean onGround;

    public EntityTeleport()
    {
    }

    public EntityTeleport(int entityId, Tuples.DoubleXYZ position, byte yaw, byte pitch, boolean onGround)
    {
        this.entityId = entityId;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
    }

}
