package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class EntityProperties extends soupply.java338.Packet
{

    public int entityId;
    public soupply.java338.type.Attribute[] attributes;

    public EntityProperties()
    {
    }

    public EntityProperties(int entityId, soupply.java338.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

}
