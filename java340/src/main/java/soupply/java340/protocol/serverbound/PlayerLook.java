package soupply.java340.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class PlayerLook extends soupply.java340.Packet
{

    public static final int ID = 15;

    public float yaw;
    public float pitch;
    public boolean onGround;

    public PlayerLook()
    {
    }

    public PlayerLook(float yaw, float pitch, boolean onGround)
    {
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
