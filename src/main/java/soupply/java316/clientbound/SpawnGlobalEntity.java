package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnGlobalEntity extends soupply.java316.Packet
{

    // type
    public static final byte THUNDERBOLT = 1;

    public int entityId;
    public byte type;
    public Tuples.DoubleXYZ position;

    public SpawnGlobalEntity()
    {
    }

    public SpawnGlobalEntity(int entityId, byte type, Tuples.DoubleXYZ position)
    {
        this.entityId = entityId;
        this.type = type;
        this.position = position;
    }

}
