package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class EntityMetadata extends soupply.java210.Packet
{

    public int entityId;
    public soupply.java210.Metadata metadata;

    public EntityMetadata()
    {
    }

    public EntityMetadata(int entityId, soupply.java210.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
    }

}
