package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityHeadLook extends soupply.java338.Packet
{

    public static final int ID = 54;

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
        _buffer.writeByte(headYaw);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
        headYaw = _buffer.readByte();
    }

    public static EntityHeadLook fromBuffer(byte[] buffer)
    {
        EntityHeadLook packet = new EntityHeadLook();
        packet.safeDecode(buffer);
        return packet;
    }

}
