package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class EntityProperties extends soupply.java340.Packet
{

    public int entityId;
    public soupply.java340.type.Attribute[] attributes;

    public EntityProperties()
    {
    }

    public EntityProperties(int entityId, soupply.java340.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

}
