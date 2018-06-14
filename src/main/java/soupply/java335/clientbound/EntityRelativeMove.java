package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class EntityRelativeMove extends soupply.java335.Packet
{

    public int entityId;
    public Tuples.ShortXYZ delta;
    public boolean onGround;

    public EntityRelativeMove()
    {
    }

    public EntityRelativeMove(int entityId, Tuples.ShortXYZ delta, boolean onGround)
    {
        this.entityId = entityId;
        this.delta = delta;
        this.onGround = onGround;
    }

}
