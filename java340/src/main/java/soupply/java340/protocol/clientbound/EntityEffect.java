package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityEffect extends soupply.java340.Packet
{

    public static final int ID = 79;

    // effect id
    public static final byte SPEED = (byte)1;
    public static final byte SLOWNESS = (byte)2;
    public static final byte HASTE = (byte)3;
    public static final byte MINING_FATIGUE = (byte)4;
    public static final byte STRENGTH = (byte)5;
    public static final byte INSTANT_HEALTH = (byte)6;
    public static final byte INSTANT_DAMAGE = (byte)7;
    public static final byte JUMP_BOOST = (byte)8;
    public static final byte NAUSEA = (byte)9;
    public static final byte REGENERATION = (byte)10;
    public static final byte RESISTANCE = (byte)11;
    public static final byte FIRE_RESISTANCE = (byte)12;
    public static final byte WATER_BREATHING = (byte)13;
    public static final byte INVISIBILITY = (byte)14;
    public static final byte BLINDNESS = (byte)15;
    public static final byte NIGHT_VISION = (byte)16;
    public static final byte HUNGER = (byte)17;
    public static final byte WEAKNESS = (byte)18;
    public static final byte POISON = (byte)19;
    public static final byte WITHER = (byte)20;
    public static final byte HEALTH_BOOST = (byte)21;
    public static final byte ABSORPTION = (byte)22;
    public static final byte SATURATION = (byte)23;
    public static final byte GLOWING = (byte)24;
    public static final byte LEVITATION = (byte)25;
    public static final byte LUCK = (byte)26;
    public static final byte BAD_LUCK = (byte)27;

    // flags
    public static final byte AMBIENT = (byte)1;
    public static final byte SHOW_PARTICLES = (byte)2;

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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(entityId);
        _buffer.writeByte(effectId);
        _buffer.writeByte(amplifier);
        _buffer.writeVaruint(duration);
        _buffer.writeByte(flags);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
        effectId = _buffer.readByte();
        amplifier = _buffer.readByte();
        duration = _buffer.readVaruint();
        flags = _buffer.readByte();
    }

    public static EntityEffect fromBuffer(byte[] buffer)
    {
        EntityEffect packet = new EntityEffect();
        packet.safeDecode(buffer);
        return packet;
    }

}
