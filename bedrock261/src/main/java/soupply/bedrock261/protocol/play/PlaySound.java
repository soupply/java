package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class PlaySound extends soupply.bedrock261.Packet
{

    public static final int ID = 86;

    public String name;
    public soupply.bedrock261.type.BlockPosition position;
    public float volume;
    public float pitch;

    public PlaySound()
    {
        this.position = new soupply.bedrock261.type.BlockPosition();
    }

    public PlaySound(String name, soupply.bedrock261.type.BlockPosition position, float volume, float pitch)
    {
        this.name = name;
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
        position.encodeBody(_buffer);
        _buffer.writeLittleEndianFloat(volume);
        _buffer.writeLittleEndianFloat(pitch);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        position.decodeBody(_buffer);
        volume = _buffer.readLittleEndianFloat();
        pitch = _buffer.readLittleEndianFloat();
    }

    public static PlaySound fromBuffer(byte[] buffer)
    {
        PlaySound packet = new PlaySound();
        packet.safeDecode(buffer);
        return packet;
    }

}
