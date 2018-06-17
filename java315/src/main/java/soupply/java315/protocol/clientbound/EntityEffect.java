package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityEffect extends soupply.java315.Packet
{

    public static final int ID = 75;

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
        _buffer.writeBigEndianByte(effectId);
        _buffer.writeBigEndianByte(amplifier);
        _buffer.writeVaruint(duration);
        _buffer.writeBigEndianByte(flags);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        effectId = _buffer.readBigEndianByte();
        amplifier = _buffer.readBigEndianByte();
        duration = _buffer.readVaruint();
        flags = _buffer.readBigEndianByte();
    }

    public static EntityEffect fromBuffer(byte[] buffer)
    {
        EntityEffect packet = new EntityEffect();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
