package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityEffect extends soupply.java335.Packet
{

    public static final int ID = 78;

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
