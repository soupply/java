package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnGlobalEntity extends soupply.java316.Packet
{

    public static final int ID = 2;

    // type
    public static final byte THUNDERBOLT = (byte)1;

    public int entityId;
    public byte type;
    public DoubleXYZ position;

    public SpawnGlobalEntity()
    {
        this.position = new DoubleXYZ();
    }

    public SpawnGlobalEntity(int entityId, byte type, DoubleXYZ position)
    {
        this.entityId = entityId;
        this.type = type;
        this.position = position;
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
        _buffer.writeByte(type);
        _buffer.writeBigEndianDouble(position.x);
        _buffer.writeBigEndianDouble(position.y);
        _buffer.writeBigEndianDouble(position.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        type = _buffer.readByte();
        position.x = _buffer.readBigEndianDouble();
        position.y = _buffer.readBigEndianDouble();
        position.z = _buffer.readBigEndianDouble();
    }

    public static SpawnGlobalEntity fromBuffer(byte[] buffer)
    {
        SpawnGlobalEntity packet = new SpawnGlobalEntity();
        packet.safeDecode(buffer);
        return packet;
    }

}
