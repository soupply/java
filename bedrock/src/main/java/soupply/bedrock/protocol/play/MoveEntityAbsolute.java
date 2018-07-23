package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class MoveEntityAbsolute extends soupply.bedrock.Packet
{

    public static final int ID = 18;

    // flags
    public static final byte GROUND = (byte)1;
    public static final byte TELEPORT = (byte)2;

    public long entityId;
    public byte flags;
    public FloatXYZ position;
    public ByteXYZ rotation;

    public MoveEntityAbsolute()
    {
        this.position = new FloatXYZ();
        this.rotation = new ByteXYZ();
    }

    public MoveEntityAbsolute(long entityId, byte flags, FloatXYZ position, ByteXYZ rotation)
    {
        this.entityId = entityId;
        this.flags = flags;
        this.position = position;
        this.rotation = rotation;
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
        _buffer.writeByte(flags);
        _buffer.writeLittleEndianFloat(position.x);
        _buffer.writeLittleEndianFloat(position.y);
        _buffer.writeLittleEndianFloat(position.z);
        _buffer.writeByte(rotation.x);
        _buffer.writeByte(rotation.y);
        _buffer.writeByte(rotation.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVarlong();
        flags = _buffer.readByte();
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        rotation.x = _buffer.readByte();
        rotation.y = _buffer.readByte();
        rotation.z = _buffer.readByte();
    }

    public static MoveEntityAbsolute fromBuffer(byte[] buffer)
    {
        MoveEntityAbsolute packet = new MoveEntityAbsolute();
        packet.safeDecode(buffer);
        return packet;
    }

}
