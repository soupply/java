package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnParticle extends soupply.java.Packet
{

    public static final int ID = 36;

    // particle id
    public static final int EXPLODE = (int)0;
    public static final int LARGE_EXPLOSION = (int)1;
    public static final int HUGE_EXPLOSION = (int)2;
    public static final int FIREWORK_SPARK = (int)3;
    public static final int BUBBLE = (int)4;
    public static final int SPLASH = (int)5;
    public static final int WAKE = (int)6;
    public static final int SUSPENDED = (int)7;
    public static final int DEPTH_SUSPEND = (int)8;
    public static final int CRIT = (int)9;
    public static final int MAGIC_CRIT = (int)10;
    public static final int SMOKE = (int)11;
    public static final int LARGE_SMOKE = (int)12;
    public static final int SPELL = (int)13;
    public static final int INSTANT_SPELL = (int)14;
    public static final int MOB_SPELL = (int)15;
    public static final int MOB_SPELL_AMBIENT = (int)16;
    public static final int WITCH_MAGIC = (int)17;
    public static final int DRIP_WATER = (int)18;
    public static final int DRIP_LAVA = (int)19;
    public static final int ANGRY_VILLAGER = (int)20;
    public static final int HAPPY_VILLAGER = (int)21;
    public static final int TOWN_AURA = (int)22;
    public static final int NOTE = (int)23;
    public static final int PORTAL = (int)24;
    public static final int ENCHANTMENT_TABLE = (int)25;
    public static final int FLAME = (int)26;
    public static final int LAVA = (int)27;
    public static final int FOOTSTEP = (int)28;
    public static final int CLOUD = (int)29;
    public static final int RED_DUST = (int)30;
    public static final int SNOWBALL_POOF = (int)31;
    public static final int SNOW_SHOVEL = (int)32;
    public static final int SLIME = (int)33;
    public static final int HEART = (int)34;
    public static final int BARRIER = (int)35;
    public static final int ITEM_CRACK = (int)36;
    public static final int BLOCK_CRACK = (int)37;
    public static final int BLOCK_DUST = (int)38;
    public static final int DROPLET = (int)39;
    public static final int TAKE = (int)40;
    public static final int MOB_APPEARANCE = (int)41;
    public static final int DRAGON_BREATH = (int)42;
    public static final int ENDROD = (int)43;
    public static final int DAMAGE_INDICATOR = (int)44;
    public static final int SWEEP_ATTACK = (int)45;
    public static final int FALLING_DUST = (int)46;

    public int particleId;
    public boolean longDistance;
    public FloatXYZ position;
    public FloatXYZ offset;
    public float data;
    public int count;
    public byte[] additionalData;

    public SpawnParticle()
    {
        this.position = new FloatXYZ();
        this.offset = new FloatXYZ();
    }

    public SpawnParticle(int particleId, boolean longDistance, FloatXYZ position, FloatXYZ offset, float data, int count, byte[] additionalData)
    {
        this.particleId = particleId;
        this.longDistance = longDistance;
        this.position = position;
        this.offset = offset;
        this.data = data;
        this.count = count;
        this.additionalData = additionalData;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianInt(particleId);
        _buffer.writeBool(longDistance);
        _buffer.writeBigEndianFloat(position.x);
        _buffer.writeBigEndianFloat(position.y);
        _buffer.writeBigEndianFloat(position.z);
        _buffer.writeBigEndianFloat(offset.x);
        _buffer.writeBigEndianFloat(offset.y);
        _buffer.writeBigEndianFloat(offset.z);
        _buffer.writeBigEndianFloat(data);
        _buffer.writeBigEndianInt(count);
        _buffer.writeBytes(additionalData);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        particleId = _buffer.readBigEndianInt();
        longDistance = _buffer.readBool();
        position.x = _buffer.readBigEndianFloat();
        position.y = _buffer.readBigEndianFloat();
        position.z = _buffer.readBigEndianFloat();
        offset.x = _buffer.readBigEndianFloat();
        offset.y = _buffer.readBigEndianFloat();
        offset.z = _buffer.readBigEndianFloat();
        data = _buffer.readBigEndianFloat();
        count = _buffer.readBigEndianInt();
        additionalData = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

    public static SpawnParticle fromBuffer(byte[] buffer)
    {
        SpawnParticle packet = new SpawnParticle();
        packet.safeDecode(buffer);
        return packet;
    }

}
