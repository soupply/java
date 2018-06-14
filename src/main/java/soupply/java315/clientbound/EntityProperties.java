package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class EntityProperties extends soupply.java315.Packet
{

    public int entityId;
    public soupply.java315.type.Attribute[] attributes;

    public EntityProperties()
    {
    }

    public EntityProperties(int entityId, soupply.java315.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

}
