package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityMetadata extends soupply.java335.Packet
{

    public static final int ID = 59;

    public int entityId;
    public soupply.java335.Metadata metadata;

    public EntityMetadata()
    {
    }

    public EntityMetadata(int entityId, soupply.java335.Metadata metadata)
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
