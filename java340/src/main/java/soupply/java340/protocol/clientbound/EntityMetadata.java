package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityMetadata extends soupply.java340.Packet
{

    public static final int ID = 60;

    public int entityId;
    public soupply.java340.metadata.Metadata metadata;

    public EntityMetadata()
    {
        this.metadata = new soupply.java340.metadata.Metadata();
    }

    public EntityMetadata(int entityId, soupply.java340.metadata.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
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
        metadata.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
        metadata.decodeBody(_buffer);
    }

    public static EntityMetadata fromBuffer(byte[] buffer)
    {
        EntityMetadata packet = new EntityMetadata();
        packet.safeDecode(buffer);
        return packet;
    }

}
