package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class EntityMetadata extends soupply.java338.Packet
{

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

}
