package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnMob extends soupply.java338.Packet
{

    public static final int ID = 3;

    public int entityId;
    public UUID uuid;
    public int type;
    public DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public byte headPitch;
    public ShortXYZ velocity;
    public soupply.java338.metadata.Metadata metadata;

    public SpawnMob()
    {
        this.uuid = new UUID(0, 0);
        this.position = new DoubleXYZ();
        this.velocity = new ShortXYZ();
        this.metadata = new soupply.java338.metadata.Metadata();
    }

    public SpawnMob(int entityId, UUID uuid, int type, DoubleXYZ position, byte yaw, byte pitch, byte headPitch, ShortXYZ velocity, soupply.java338.metadata.Metadata metadata)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.type = type;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.headPitch = headPitch;
        this.velocity = velocity;
        this.metadata = metadata;
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
        _buffer.writeVaruint(type);
        _buffer.writeBigEndianDouble(position.x);
        _buffer.writeBigEndianDouble(position.y);
        _buffer.writeBigEndianDouble(position.z);
        _buffer.writeByte(yaw);
        _buffer.writeByte(pitch);
        _buffer.writeByte(headPitch);
        _buffer.writeBigEndianShort(velocity.x);
        _buffer.writeBigEndianShort(velocity.y);
        _buffer.writeBigEndianShort(velocity.z);
        metadata.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        uuid = _buffer.readUUID();
        type = _buffer.readVaruint();
        position.x = _buffer.readBigEndianDouble();
        position.y = _buffer.readBigEndianDouble();
        position.z = _buffer.readBigEndianDouble();
        yaw = _buffer.readByte();
        pitch = _buffer.readByte();
        headPitch = _buffer.readByte();
        velocity.x = _buffer.readBigEndianShort();
        velocity.y = _buffer.readBigEndianShort();
        velocity.z = _buffer.readBigEndianShort();
        metadata.decodeBody(_buffer);
    }

    public static SpawnMob fromBuffer(byte[] buffer)
    {
        SpawnMob packet = new SpawnMob();
        packet.safeDecode(buffer);
        return packet;
    }

}
