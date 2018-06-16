package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityMetadata extends soupply.java340.Packet
{

    public static final int ID = 60;

    public int entityId;
    public soupply.java340.Metadata metadata;

    public EntityMetadata()
    {
        this.metadata = new soupply.java340.Metadata();
    }

    public EntityMetadata(int entityId, soupply.java340.Metadata metadata)
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
