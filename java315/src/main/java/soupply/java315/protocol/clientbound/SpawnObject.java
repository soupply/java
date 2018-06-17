package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnObject extends soupply.java315.Packet
{

    public static final int ID = 0;

    public int entityId;
    public UUID uuid;
    public byte type;
    public DoubleXYZ position;
    public byte pitch;
    public byte yaw;
    public int data;
    public ShortXYZ velocity;

    public SpawnObject()
    {
        this.uuid = new UUID();
        this.position = new DoubleXYZ();
        this.velocity = new ShortXYZ();
    }

    public SpawnObject(int entityId, UUID uuid, byte type, DoubleXYZ position, byte pitch, byte yaw, int data, ShortXYZ velocity)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.type = type;
        this.position = position;
        this.pitch = pitch;
        this.yaw = yaw;
        this.data = data;
        this.velocity = velocity;
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
        _buffer.writeUUID(uuid);
        _buffer.writeByte(type);
        _buffer.writeBigEndianDouble(position.x);
        _buffer.writeBigEndianDouble(position.y);
        _buffer.writeBigEndianDouble(position.z);
        _buffer.writeByte(pitch);
        _buffer.writeByte(yaw);
        _buffer.writeBigEndianInt(data);
        _buffer.writeBigEndianShort(velocity.x);
        _buffer.writeBigEndianShort(velocity.y);
        _buffer.writeBigEndianShort(velocity.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        uuid = _buffer.readUUID();
        type = _buffer.readByte();
        position.x = _buffer.readBigEndianDouble();
        position.y = _buffer.readBigEndianDouble();
        position.z = _buffer.readBigEndianDouble();
        pitch = _buffer.readByte();
        yaw = _buffer.readByte();
        data = _buffer.readBigEndianInt();
        velocity.x = _buffer.readBigEndianShort();
        velocity.y = _buffer.readBigEndianShort();
        velocity.z = _buffer.readBigEndianShort();
    }

    public static SpawnObject fromBuffer(byte[] buffer)
    {
        SpawnObject packet = new SpawnObject();
        packet.safeDecode(buffer);
        return packet;
    }

}
