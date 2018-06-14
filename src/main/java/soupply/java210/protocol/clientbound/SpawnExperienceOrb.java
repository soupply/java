package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnExperienceOrb extends soupply.java210.Packet
{

    public static final int ID = 1;

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

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
