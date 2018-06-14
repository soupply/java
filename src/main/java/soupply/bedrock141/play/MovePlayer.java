package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class MovePlayer extends soupply.bedrock141.Packet
{

    // animation
    public static final byte FULL = 0;
    public static final byte NONE = 1;
    public static final byte TELEPORT = 2;
    public static final byte PITCH = 3;

    public long entityId;
    public Tuples.FloatXYZ position;
    public float pitch;
    public float headYaw;
    public float yaw;
    public byte animation;
    public boolean onGround;
    public long unknown7;
    public int unknown8;
    public int unknown9;

    public MovePlayer()
    {
    }

    public MovePlayer(long entityId, Tuples.FloatXYZ position, float pitch, float headYaw, float yaw, byte animation, boolean onGround, long unknown7, int unknown8, int unknown9)
    {
        this.entityId = entityId;
        this.position = position;
        this.pitch = pitch;
        this.headYaw = headYaw;
        this.yaw = yaw;
        this.animation = animation;
        this.onGround = onGround;
        this.unknown7 = unknown7;
        this.unknown8 = unknown8;
        this.unknown9 = unknown9;
    }

}
