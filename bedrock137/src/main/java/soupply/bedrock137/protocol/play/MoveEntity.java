package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class MoveEntity extends soupply.bedrock137.Packet
{

    public static final int ID = 18;

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

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
