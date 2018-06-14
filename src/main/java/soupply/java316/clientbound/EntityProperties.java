package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class EntityProperties extends soupply.java316.Packet
{

    public int entityId;
    public soupply.java316.type.Attribute[] attributes;

    public EntityProperties()
    {
    }

    public EntityProperties(int entityId, soupply.java316.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

}
