package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityTeleport extends soupply.java315.Packet
{

    public static final int ID = 73;

    public int entityId;
    public DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public boolean onGround;

    public EntityTeleport()
    {
        this.position = new DoubleXYZ();
    }

    public EntityTeleport(int entityId, DoubleXYZ position, byte yaw, byte pitch, boolean onGround)
    {
        this.entityId = entityId;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
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