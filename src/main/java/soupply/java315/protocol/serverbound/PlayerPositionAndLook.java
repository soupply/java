package soupply.java315.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class PlayerPositionAndLook extends soupply.java315.Packet
{

    public static final int ID = 13;

    public Tuples.DoubleXYZ position;
    public float yaw;
    public float pitch;
    public boolean onGround;

    public PlayerPositionAndLook()
    {
    }

    public PlayerPositionAndLook(Tuples.DoubleXYZ position, float yaw, float pitch, boolean onGround)
    {
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
