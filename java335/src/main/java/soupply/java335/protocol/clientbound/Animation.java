package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Animation extends soupply.java335.Packet
{

    public static final int ID = 6;

    // animation
    public static final byte SWING_MAIN_ARM = 0;
    public static final byte TAKE_DAMAGE = 1;
    public static final byte LEAVE_BED = 2;
    public static final byte SWING_OFFHAND = 3;
    public static final byte CRITICAL_EFFECT = 4;
    public static final byte MAGICAL_CRITICAL_EFFECT = 5;

    public int entityId;
    public byte animation;

    public Animation()
    {
    }

    public Animation(int entityId, byte animation)
    {
        this.entityId = entityId;
        this.animation = animation;
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
