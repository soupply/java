package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityMetadata extends soupply.java316.Packet
{

    public static final int ID = 57;

    public int entityId;
    public soupply.java316.Metadata metadata;

    public EntityMetadata()
    {
        this.metadata = new soupply.java316.Metadata();
    }

    public EntityMetadata(int entityId, soupply.java316.Metadata metadata)
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
