package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class EntityFall extends soupply.bedrock.Packet
{

    public static final int ID = 37;

    public long entityId;
    public float distance;
    public boolean unknown2;

    public EntityFall()
    {
    }

    public EntityFall(long entityId, float distance, boolean unknown2)
    {
        this.entityId = entityId;
        this.distance = distance;
        this.unknown2 = unknown2;
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
        _buffer.writeLittleEndianFloat(distance);
        _buffer.writeBool(unknown2);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        distance = _buffer.readLittleEndianFloat();
        unknown2 = _buffer.readBool();
    }

    public static EntityFall fromBuffer(byte[] buffer)
    {
        EntityFall packet = new EntityFall();
        packet.safeDecode(buffer);
        return packet;
    }

}
