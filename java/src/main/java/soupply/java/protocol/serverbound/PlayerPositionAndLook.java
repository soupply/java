package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class PlayerPositionAndLook extends soupply.java.Packet
{

    public static final int ID = 14;

    public DoubleXYZ position;
    public float yaw;
    public float pitch;
    public boolean onGround;

    public PlayerPositionAndLook()
    {
        this.position = new DoubleXYZ();
    }

    public PlayerPositionAndLook(DoubleXYZ position, float yaw, float pitch, boolean onGround)
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
