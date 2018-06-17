package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class MoveEntity extends soupply.bedrock.Packet
{

    public static final int ID = 18;

    public long entityId;
    public FloatXYZ position;
    public byte pitch;
    public byte headYaw;
    public byte yaw;
    public boolean onGround;
    public boolean teleported;

    public MoveEntity()
    {
        this.position = new FloatXYZ();
    }

    public MoveEntity(long entityId, FloatXYZ position, byte pitch, byte headYaw, byte yaw, boolean onGround, boolean teleported)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
