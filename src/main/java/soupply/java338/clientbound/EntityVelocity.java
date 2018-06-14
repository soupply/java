package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class EntityVelocity extends soupply.java338.Packet
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
