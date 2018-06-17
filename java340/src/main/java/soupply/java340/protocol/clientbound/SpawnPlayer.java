package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnPlayer extends soupply.java340.Packet
{

    public static final int ID = 5;

    public int entityId;
    public UUID uuid;
    public DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public soupply.java340.Metadata metadata;

    public SpawnPlayer()
    {
        this.uuid = new UUID();
        this.position = new DoubleXYZ();
        this.metadata = new soupply.java340.Metadata();
    }

    public SpawnPlayer(int entityId, UUID uuid, DoubleXYZ position, byte yaw, byte pitch, soupply.java340.Metadata metadata)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
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
        _buffer.writeBigEndianDouble(position.x);
        _buffer.writeBigEndianDouble(position.y);
        _buffer.writeBigEndianDouble(position.z);
        _buffer.writeBigEndianByte(yaw);
        _buffer.writeBigEndianByte(pitch);
        metadata.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        uuid = _buffer.readUUID();
        position.x = _buffer.readBigEndianDouble();
        position.y = _buffer.readBigEndianDouble();
        position.z = _buffer.readBigEndianDouble();
        yaw = _buffer.readBigEndianByte();
        pitch = _buffer.readBigEndianByte();
        metadata.decodeBody(_buffer);
    }

    public static SpawnPlayer fromBuffer(byte[] buffer)
    {
        SpawnPlayer packet = new SpawnPlayer();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
