package soupply.java315.serverbound;

import java.util.*;
import soupply.util.*;

class PlayerAbilities extends soupply.java315.Packet
{

    // flags
    public static final byte CREATIVE_MODE = 1;
    public static final byte FLYING = 2;
    public static final byte ALLOW_FLYING = 4;
    public static final byte INVINCIBLE = 8;

    public byte flags;
    public float flyingSpeed;
    public float walkingSpeed;

    public PlayerAbilities()
    {
    }

    public PlayerAbilities(byte flags, float flyingSpeed, float walkingSpeed)
    {
        this.flags = flags;
        this.flyingSpeed = flyingSpeed;
        this.walkingSpeed = walkingSpeed;
    }

}
