package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityHeadLook extends soupply.java316.Packet
{

    public static final int ID = 52;

    public int entityId;
    public byte headYaw;

    public EntityHeadLook()
    {
    }

    public EntityHeadLook(int entityId, byte headYaw)
    {
        this.entityId = entityId;
        this.headYaw = headYaw;
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
        _buffer.writeBigEndianByte(headYaw);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        headYaw = _buffer.readBigEndianByte();
    }

    public static EntityHeadLook fromBuffer(byte[] buffer)
    {
        EntityHeadLook packet = new EntityHeadLook();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
