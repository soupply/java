package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityVelocity extends soupply.java316.Packet
{

    public static final int ID = 59;

    public int entityId;
    public ShortXYZ velocity;

    public EntityVelocity()
    {
        this.velocity = new ShortXYZ();
    }

    public EntityVelocity(int entityId, ShortXYZ velocity)
    {
        this.entityId = entityId;
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
        _buffer.writeBigEndianShort(velocity.x);
        _buffer.writeBigEndianShort(velocity.y);
        _buffer.writeBigEndianShort(velocity.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        velocity.x = _buffer.readBigEndianShort();
        velocity.y = _buffer.readBigEndianShort();
        velocity.z = _buffer.readBigEndianShort();
    }

    public static EntityVelocity fromBuffer(byte[] buffer)
    {
        EntityVelocity packet = new EntityVelocity();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
