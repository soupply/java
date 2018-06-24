package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class MobEffect extends soupply.bedrock261.Packet
{

    public static final int ID = 28;

    // event id
    public static final byte ADD = (byte)1;
    public static final byte MODIFY = (byte)2;
    public static final byte REMOVE = (byte)3;

    // effect
    public static final int SPEED = (int)1;
    public static final int SLOWNESS = (int)2;
    public static final int HASTE = (int)3;
    public static final int MINING_FATIGUE = (int)4;
    public static final int STRENGTH = (int)5;
    public static final int INSTANT_HEALTH = (int)6;
    public static final int INSTANT_DAMAGE = (int)7;
    public static final int JUMP_BOOST = (int)8;
    public static final int NAUSEA = (int)9;
    public static final int REGENERATION = (int)10;
    public static final int RESISTANCE = (int)11;
    public static final int FIRE_RESISTANCE = (int)12;
    public static final int WATER_BREATHING = (int)13;
    public static final int INVISIBILITY = (int)14;
    public static final int BLINDNESS = (int)15;
    public static final int NIGHT_VISION = (int)16;
    public static final int HUNGER = (int)17;
    public static final int WEAKNESS = (int)18;
    public static final int POISON = (int)19;
    public static final int WITHER = (int)20;
    public static final int HEALTH_BOOST = (int)21;
    public static final int ABSORPTION = (int)22;
    public static final int SATURATION = (int)23;
    public static final int LEVITATION = (int)24;
    public static final int FATAL_POISON = (int)25;

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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
        _buffer.writeByte(eventId);
        _buffer.writeVarint(effect);
        _buffer.writeVarint(amplifier);
        _buffer.writeBool(particles);
        _buffer.writeVarint(duration);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVarlong();
        eventId = _buffer.readByte();
        effect = _buffer.readVarint();
        amplifier = _buffer.readVarint();
        particles = _buffer.readBool();
        duration = _buffer.readVarint();
    }

    public static MobEffect fromBuffer(byte[] buffer)
    {
        MobEffect packet = new MobEffect();
        packet.safeDecode(buffer);
        return packet;
    }

}
