package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityMetadata extends soupply.java338.Packet
{

    public static final int ID = 60;

    public int entityId;
    public soupply.java338.Metadata metadata;

    public EntityMetadata()
    {
        this.metadata = new soupply.java338.Metadata();
    }

    public EntityMetadata(int entityId, soupply.java338.Metadata metadata)
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
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        metadata.decodeBody(_buffer);
    }

    public static EntityMetadata fromBuffer(byte[] buffer)
    {
        EntityMetadata packet = new EntityMetadata();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
