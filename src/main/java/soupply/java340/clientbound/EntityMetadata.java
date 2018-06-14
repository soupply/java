package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class EntityMetadata extends soupply.java340.Packet
{

    public int entityId;
    public soupply.java340.Metadata metadata;

    public EntityMetadata()
    {
    }

    public EntityMetadata(int entityId, soupply.java340.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
    }

}
