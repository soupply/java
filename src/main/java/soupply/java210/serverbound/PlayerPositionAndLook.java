package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class PlayerPositionAndLook extends soupply.java210.Packet
{

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

}
