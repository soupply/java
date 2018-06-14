package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class EntityLook extends soupply.java315.Packet
{

    public int entityId;
    public byte yaw;
    public byte pitch;
    public boolean onGround;

    public EntityLook()
    {
    }

    public EntityLook(int entityId, byte yaw, byte pitch, boolean onGround)
    {
        this.entityId = entityId;
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
    }

}
