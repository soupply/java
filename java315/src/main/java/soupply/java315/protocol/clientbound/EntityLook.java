package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityLook extends soupply.java315.Packet
{

    public static final int ID = 39;

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
        _buffer.writeByte(yaw);
        _buffer.writeByte(pitch);
        _buffer.writeBool(onGround);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        yaw = _buffer.readByte();
        pitch = _buffer.readByte();
        onGround = _buffer.readBool();
    }

    public static EntityLook fromBuffer(byte[] buffer)
    {
        EntityLook packet = new EntityLook();
        packet.safeDecode(buffer);
        return packet;
    }

}
