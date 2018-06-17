package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Entity extends soupply.java315.Packet
{

    public static final int ID = 40;

    public int entityId;

    public Entity()
    {
    }

    public Entity(int entityId)
    {
        this.entityId = entityId;
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
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
    }

    public static Entity fromBuffer(byte[] buffer)
    {
        Entity packet = new Entity();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
