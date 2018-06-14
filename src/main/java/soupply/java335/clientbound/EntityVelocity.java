package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class EntityVelocity extends soupply.java335.Packet
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
