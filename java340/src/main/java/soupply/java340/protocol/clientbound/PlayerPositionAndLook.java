package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class PlayerPositionAndLook extends soupply.java340.Packet
{

    public static final int ID = 47;

    // flags
    public static final byte X = (byte)1;
    public static final byte Y = (byte)2;
    public static final byte Z = (byte)4;
    public static final byte Y_ROTATION = (byte)8;
    public static final byte X_ROTATION = (byte)16;

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
