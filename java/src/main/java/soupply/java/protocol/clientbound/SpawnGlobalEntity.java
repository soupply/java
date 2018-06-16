package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnGlobalEntity extends soupply.java.Packet
{

    public static final int ID = 2;

    // type
    public static final byte THUNDERBOLT = 1;

    public int entityId;
    public byte type;
    public Tuples.DoubleXYZ position;

    public SpawnGlobalEntity()
    {
        this.position = new Tuples.DoubleXYZ();
    }

    public SpawnGlobalEntity(int entityId, byte type, Tuples.DoubleXYZ position)
    {
        this.entityId = entityId;
        this.type = type;
        this.position = position;
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
