package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityEffect extends soupply.java.Packet
{

    public static final int ID = 79;

    // flags
    public static final byte AMBIENT = 1;
    public static final byte SHOW_PARTICLES = 2;

    public int entityId;
    public byte effectId;
    public byte amplifier;
    public int duration;
    public byte flags;

    public EntityEffect()
    {
    }

    public EntityEffect(int entityId, byte effectId, byte amplifier, int duration, byte flags)
    {
        this.entityId = entityId;
        this.effectId = effectId;
        this.amplifier = amplifier;
        this.duration = duration;
        this.flags = flags;
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
