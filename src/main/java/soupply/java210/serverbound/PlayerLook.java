package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class PlayerLook extends soupply.java210.Packet
{

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

}
