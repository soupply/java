package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class MobEffect extends soupply.bedrock201.Packet
{

    public static final int ID = 28;

    // event id
    public static final byte ADD = (byte)1;
    public static final byte MODIFY = (byte)2;
    public static final byte REMOVE = (byte)3;

    public long entityId;
    public byte eventId;
    public int effect;
    public int amplifier;
    public boolean particles;
    public int duration;

    public MobEffect()
    {
    }

    public MobEffect(long entityId, byte eventId, int effect, int amplifier, boolean particles, int duration)
    {
        this.entityId = entityId;
        this.eventId = eventId;
        this.effect = effect;
        this.amplifier = amplifier;
        this.particles = particles;
        this.duration = duration;
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
