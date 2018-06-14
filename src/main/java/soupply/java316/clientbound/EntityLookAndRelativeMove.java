package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class EntityLookAndRelativeMove extends soupply.java316.Packet
{

    public int entityId;
    public Tuples.ShortXYZ delta;
    public byte yaw;
    public byte pitch;
    public boolean onGround;

    public EntityLookAndRelativeMove()
    {
    }

    public EntityLookAndRelativeMove(int entityId, Tuples.ShortXYZ delta, byte yaw, byte pitch, boolean onGround)
    {
        this.entityId = entityId;
        this.delta = delta;
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
    }

}
