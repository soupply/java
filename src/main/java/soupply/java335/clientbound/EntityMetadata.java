package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class EntityMetadata extends soupply.java335.Packet
{

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

}
