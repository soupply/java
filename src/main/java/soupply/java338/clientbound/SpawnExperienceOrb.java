package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnExperienceOrb extends soupply.java338.Packet
{

    public int entityId;
    public Tuples.DoubleXYZ position;
    public short count;

    public SpawnExperienceOrb()
    {
    }

    public SpawnExperienceOrb(int entityId, Tuples.DoubleXYZ position, short count)
    {
        this.entityId = entityId;
        this.position = position;
        this.count = count;
    }

}
