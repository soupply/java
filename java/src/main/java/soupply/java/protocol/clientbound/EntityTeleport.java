package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityTeleport extends soupply.java.Packet
{

    public static final int ID = 76;

    public int entityId;
    public DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public boolean onGround;

    public EntityTeleport()
    {
        this.position = new DoubleXYZ();
    }

    public EntityTeleport(int entityId, DoubleXYZ position, byte yaw, byte pitch, boolean onGround)
    {
        this.entityId = entityId;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
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
        _buffer.writeBigEndianDouble(position.x);
        _buffer.writeBigEndianDouble(position.y);
        _buffer.writeBigEndianDouble(position.z);
        _buffer.writeBigEndianByte(yaw);
        _buffer.writeBigEndianByte(pitch);
        _buffer.writeBool(onGround);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        position.x = _buffer.readBigEndianDouble();
        position.y = _buffer.readBigEndianDouble();
        position.z = _buffer.readBigEndianDouble();
        yaw = _buffer.readBigEndianByte();
        pitch = _buffer.readBigEndianByte();
        onGround = _buffer.readBool();
    }

    public static EntityTeleport fromBuffer(byte[] buffer)
    {
        EntityTeleport packet = new EntityTeleport();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
