package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class EntityVelocity extends soupply.java316.Packet
{

    public int entityId;
    public Tuples.ShortXYZ velocity;

    public EntityVelocity()
    {
    }

    public EntityVelocity(int entityId, Tuples.ShortXYZ velocity)
    {
        this.entityId = entityId;
        this.velocity = velocity;
    }

}
