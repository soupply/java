package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityLookAndRelativeMove extends soupply.java210.Packet
{

    public static final int ID = 38;

    public int entityId;
    public ShortXYZ delta;
    public byte yaw;
    public byte pitch;
    public boolean onGround;

    public EntityLookAndRelativeMove()
    {
        this.delta = new ShortXYZ();
    }

    public EntityLookAndRelativeMove(int entityId, ShortXYZ delta, byte yaw, byte pitch, boolean onGround)
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
