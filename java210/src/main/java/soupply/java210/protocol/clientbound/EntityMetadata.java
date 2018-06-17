package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityMetadata extends soupply.java210.Packet
{

    public static final int ID = 57;

    public int entityId;
    public soupply.java210.Metadata metadata;

    public EntityMetadata()
    {
        this.metadata = new soupply.java210.Metadata();
    }

    public EntityMetadata(int entityId, soupply.java210.Metadata metadata)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
