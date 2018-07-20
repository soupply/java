package soupply.java393.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class Entity extends soupply.java393.Packet
{

    public static final int ID = 39;

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
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
    }

    public static Entity fromBuffer(byte[] buffer)
    {
        Entity packet = new Entity();
        packet.safeDecode(buffer);
        return packet;
    }

}
