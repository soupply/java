package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class MovePlayer extends soupply.bedrock.Packet
{

    public static final int ID = 19;

    // animation
    public static final byte FULL = (byte)0;
    public static final byte NONE = (byte)1;
    public static final byte TELEPORT = (byte)2;
    public static final byte PITCH = (byte)3;

    public long entityId;
    public FloatXYZ position;
    public float pitch;
    public float headYaw;
    public float yaw;
    public byte animation;
    public boolean onGround;
    public long unknown7;
    public int unknown8;
    public int unknown9;

    public MovePlayer()
    {
        this.position = new FloatXYZ();
    }

    public MovePlayer(long entityId, FloatXYZ position, float pitch, float headYaw, float yaw, byte animation, boolean onGround, long unknown7, int unknown8, int unknown9)
    {
        this.entityId = entityId;
        this.position = position;
        this.pitch = pitch;
        this.headYaw = headYaw;
        this.yaw = yaw;
        this.animation = animation;
        this.onGround = onGround;
        this.unknown7 = unknown7;
        this.unknown8 = unknown8;
        this.unknown9 = unknown9;
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
        _buffer.writeLittleEndianFloat(pitch);
        _buffer.writeLittleEndianFloat(headYaw);
        _buffer.writeLittleEndianFloat(yaw);
        _buffer.writeByte(animation);
        _buffer.writeBool(onGround);
        _buffer.writeVarlong(unknown7);
        _buffer.writeLittleEndianInt(unknown8);
        _buffer.writeLittleEndianInt(unknown9);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        pitch = _buffer.readLittleEndianFloat();
        headYaw = _buffer.readLittleEndianFloat();
        yaw = _buffer.readLittleEndianFloat();
        animation = _buffer.readByte();
        onGround = _buffer.readBool();
        unknown7 = _buffer.readVarlong();
        unknown8 = _buffer.readLittleEndianInt();
        unknown9 = _buffer.readLittleEndianInt();
    }

    public static MovePlayer fromBuffer(byte[] buffer)
    {
        MovePlayer packet = new MovePlayer();
        packet.safeDecode(buffer);
        return packet;
    }

}
