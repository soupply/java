package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityMetadata extends soupply.java338.Packet
{

    public static final int ID = 60;

    public int entityId;
    public soupply.java338.Metadata metadata;

    public EntityMetadata()
    {
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
