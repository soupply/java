package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class EntityProperties extends soupply.java210.Packet
{

    public int entityId;
    public soupply.java210.type.Attribute[] attributes;

    public EntityProperties()
    {
    }

    public EntityProperties(int entityId, soupply.java210.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

}
