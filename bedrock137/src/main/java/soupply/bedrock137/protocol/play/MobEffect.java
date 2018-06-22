package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class MobEffect extends soupply.bedrock137.Packet
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
