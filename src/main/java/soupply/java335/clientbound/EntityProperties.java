package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class EntityProperties extends soupply.java335.Packet
{

    public int entityId;
    public soupply.java335.type.Attribute[] attributes;

    public EntityProperties()
    {
    }

    public EntityProperties(int entityId, soupply.java335.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

}
