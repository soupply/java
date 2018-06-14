package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class EntityMetadata extends soupply.java315.Packet
{

    public int entityId;
    public soupply.java315.Metadata metadata;

    public EntityMetadata()
    {
    }

    public EntityMetadata(int entityId, soupply.java315.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
    }

}
