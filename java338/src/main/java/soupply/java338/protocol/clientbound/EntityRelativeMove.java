package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityRelativeMove extends soupply.java338.Packet
{

    public static final int ID = 38;

    public int entityId;
    public ShortXYZ delta;
    public boolean onGround;

    public EntityRelativeMove()
    {
        this.delta = new ShortXYZ();
    }

    public EntityRelativeMove(int entityId, ShortXYZ delta, boolean onGround)
    {
        this.entityId = entityId;
        this.delta = delta;
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
        _buffer.writeBool(onGround);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        delta.x = _buffer.readBigEndianShort();
        delta.y = _buffer.readBigEndianShort();
        delta.z = _buffer.readBigEndianShort();
        onGround = _buffer.readBool();
    }

    public static EntityRelativeMove fromBuffer(byte[] buffer)
    {
        EntityRelativeMove packet = new EntityRelativeMove();
        packet.safeDecode(buffer);
        return packet;
    }

}
