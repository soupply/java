package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityLookAndRelativeMove extends soupply.java210.Packet
{

    public static final int ID = 38;

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
