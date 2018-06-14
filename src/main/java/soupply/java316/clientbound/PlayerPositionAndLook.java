package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class PlayerPositionAndLook extends soupply.java316.Packet
{

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
    }

    public PlayerPositionAndLook(Tuples.DoubleXYZ position, float yaw, float pitch, byte flags, int teleportId)
    {
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.flags = flags;
        this.teleportId = teleportId;
    }

}
