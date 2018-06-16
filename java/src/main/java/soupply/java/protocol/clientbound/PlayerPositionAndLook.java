package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class PlayerPositionAndLook extends soupply.java.Packet
{

    public static final int ID = 47;

    // flags
    public static final byte X = 1;
    public static final byte Y = 2;
    public static final byte Z = 4;
    public static final byte Y_ROTATION = 8;
    public static final byte X_ROTATION = 16;

    public DoubleXYZ position;
    public float yaw;
    public float pitch;
    public byte flags;
    public int teleportId;

    public PlayerPositionAndLook()
    {
        this.position = new DoubleXYZ();
    }

    public PlayerPositionAndLook(DoubleXYZ position, float yaw, float pitch, byte flags, int teleportId)
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
