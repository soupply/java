package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class NamedSoundEffect extends soupply.java335.Packet
{

    public static final int ID = 25;

    public String name;
    public int category;
    public IntXYZ position;
    public float volume;
    public float pitch;

    public NamedSoundEffect()
    {
        this.position = new IntXYZ();
    }

    public NamedSoundEffect(String name, int category, IntXYZ position, float volume, float pitch)
    {
        this.name = name;
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
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
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
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        category = _buffer.readVaruint();
        position.x = _buffer.readBigEndianInt();
        position.y = _buffer.readBigEndianInt();
        position.z = _buffer.readBigEndianInt();
        volume = _buffer.readBigEndianFloat();
        pitch = _buffer.readBigEndianFloat();
    }

    public static NamedSoundEffect fromBuffer(byte[] buffer)
    {
        NamedSoundEffect packet = new NamedSoundEffect();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
