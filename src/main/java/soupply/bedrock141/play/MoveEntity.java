package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class MoveEntity extends soupply.bedrock141.Packet
{

    public long entityId;
    public Tuples.FloatXYZ position;
    public byte pitch;
    public byte headYaw;
    public byte yaw;
    public boolean onGround;
    public boolean teleported;

    public MoveEntity()
    {
    }

    public MoveEntity(long entityId, Tuples.FloatXYZ position, byte pitch, byte headYaw, byte yaw, boolean onGround, boolean teleported)
    {
        this.entityId = entityId;
        this.position = position;
        this.pitch = pitch;
        this.headYaw = headYaw;
        this.yaw = yaw;
        this.onGround = onGround;
        this.teleported = teleported;
    }

}
