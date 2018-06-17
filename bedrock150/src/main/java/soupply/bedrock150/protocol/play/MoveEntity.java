package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class MoveEntity extends soupply.bedrock150.Packet
{

    public static final int ID = 18;

    public long entityId;
    public FloatXYZ position;
    public byte pitch;
    public byte headYaw;
    public byte yaw;
    public boolean onGround;
    public boolean teleported;

    public MoveEntity()
    {
        this.position = new FloatXYZ();
    }

    public MoveEntity(long entityId, FloatXYZ position, byte pitch, byte headYaw, byte yaw, boolean onGround, boolean teleported)
    {
        this.entityId = entityId;
        this.position = position;
        this.pitch = pitch;
        this.headYaw = headYaw;
        this.yaw = yaw;
        this.onGround = onGround;
        this.teleported = teleported;
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
        _buffer.writeLittleEndianFloat(position.x);
        _buffer.writeLittleEndianFloat(position.y);
        _buffer.writeLittleEndianFloat(position.z);
        _buffer.writeLittleEndianByte(pitch);
        _buffer.writeLittleEndianByte(headYaw);
        _buffer.writeLittleEndianByte(yaw);
        _buffer.writeBool(onGround);
        _buffer.writeBool(teleported);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        pitch = _buffer.readLittleEndianByte();
        headYaw = _buffer.readLittleEndianByte();
        yaw = _buffer.readLittleEndianByte();
        onGround = _buffer.readBool();
        teleported = _buffer.readBool();
    }

    public static MoveEntity fromBuffer(byte[] buffer)
    {
        MoveEntity packet = new MoveEntity();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
