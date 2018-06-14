package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class EntityMetadata extends soupply.java316.Packet
{

    public int entityId;
    public soupply.java316.Metadata metadata;

    public EntityMetadata()
    {
    }

    public EntityMetadata(int entityId, soupply.java316.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
    }

}
