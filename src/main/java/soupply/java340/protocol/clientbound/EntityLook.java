package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityLook extends soupply.java340.Packet
{

    public static final int ID = 40;

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
