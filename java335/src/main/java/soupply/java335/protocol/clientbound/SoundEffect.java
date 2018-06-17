package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SoundEffect extends soupply.java335.Packet
{

    public static final int ID = 72;

    public int soundId;
    public int category;
    public IntXYZ position;
    public float volume;
    public float pitch;

    public SoundEffect()
    {
        this.position = new IntXYZ();
    }

    public SoundEffect(int soundId, int category, IntXYZ position, float volume, float pitch)
    {
        this.soundId = soundId;
        this.category = category;
        this.position = position;
        this.volume = volume;
        this.pitch = pitch;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(soundId);
        _buffer.writeVaruint(category);
        _buffer.writeBigEndianInt(position.x);
        _buffer.writeBigEndianInt(position.y);
        _buffer.writeBigEndianInt(position.z);
        _buffer.writeBigEndianFloat(volume);
        _buffer.writeBigEndianFloat(pitch);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        soundId = _buffer.readVaruint();
        category = _buffer.readVaruint();
        position.x = _buffer.readBigEndianInt();
        position.y = _buffer.readBigEndianInt();
        position.z = _buffer.readBigEndianInt();
        volume = _buffer.readBigEndianFloat();
        pitch = _buffer.readBigEndianFloat();
    }

    public static SoundEffect fromBuffer(byte[] buffer)
    {
        SoundEffect packet = new SoundEffect();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
