package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnExperienceOrb extends soupply.java210.Packet
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
