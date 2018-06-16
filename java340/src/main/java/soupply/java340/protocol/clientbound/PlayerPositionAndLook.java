package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class PlayerPositionAndLook extends soupply.java340.Packet
{

    public static final int ID = 47;

    // flags
    public static final byte X = 1;
    public static final byte Y = 2;
    public static final byte Z = 4;
    public static final byte Y_ROTATION = 8;
    public static final byte X_ROTATION = 16;

    public Tuples.DoubleXYZ position;
    public float yaw;
    public float pitch;
    public byte flags;
    public int teleportId;

    public PlayerPositionAndLook()
    {
        this.position = new Tuples.DoubleXYZ();
    }

    public PlayerPositionAndLook(Tuples.DoubleXYZ position, float yaw, float pitch, byte flags, int teleportId)
    {
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.flags = flags;
        this.teleportId = teleportId;
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
