package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityLook extends soupply.java340.Packet
{

    public static final int ID = 40;

    public int entityId;
    public byte yaw;
    public byte pitch;
    public boolean onGround;

    public EntityLook()
    {
    }

    public EntityLook(int entityId, byte yaw, byte pitch, boolean onGround)
    {
        this.entityId = entityId;
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
        _buffer.writeBigEndianByte(yaw);
        _buffer.writeBigEndianByte(pitch);
        _buffer.writeBool(onGround);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        yaw = _buffer.readBigEndianByte();
        pitch = _buffer.readBigEndianByte();
        onGround = _buffer.readBool();
    }

    public static EntityLook fromBuffer(byte[] buffer)
    {
        EntityLook packet = new EntityLook();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
