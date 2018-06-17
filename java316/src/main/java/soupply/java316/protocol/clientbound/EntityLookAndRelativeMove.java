package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityLookAndRelativeMove extends soupply.java316.Packet
{

    public static final int ID = 38;

    public int entityId;
    public ShortXYZ delta;
    public byte yaw;
    public byte pitch;
    public boolean onGround;

    public EntityLookAndRelativeMove()
    {
        this.delta = new ShortXYZ();
    }

    public EntityLookAndRelativeMove(int entityId, ShortXYZ delta, byte yaw, byte pitch, boolean onGround)
    {
        this.entityId = entityId;
        this.delta = delta;
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
        _buffer.writeBigEndianShort(delta.x);
        _buffer.writeBigEndianShort(delta.y);
        _buffer.writeBigEndianShort(delta.z);
        _buffer.writeBigEndianByte(yaw);
        _buffer.writeBigEndianByte(pitch);
        _buffer.writeBool(onGround);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        delta.x = _buffer.readBigEndianShort();
        delta.y = _buffer.readBigEndianShort();
        delta.z = _buffer.readBigEndianShort();
        yaw = _buffer.readBigEndianByte();
        pitch = _buffer.readBigEndianByte();
        onGround = _buffer.readBool();
    }

    public static EntityLookAndRelativeMove fromBuffer(byte[] buffer)
    {
        EntityLookAndRelativeMove packet = new EntityLookAndRelativeMove();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
