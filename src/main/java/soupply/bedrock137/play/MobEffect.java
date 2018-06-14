package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class MobEffect extends soupply.bedrock137.Packet
{

    // event id
    public static final byte ADD = 1;
    public static final byte MODIFY = 2;
    public static final byte REMOVE = 3;

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

}
