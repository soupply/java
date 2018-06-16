package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnMob extends soupply.java.Packet
{

    public static final int ID = 3;

    public int entityId;
    public UUID uuid;
    public int type;
    public Tuples.DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public byte headPitch;
    public Tuples.ShortXYZ velocity;
    public soupply.java.Metadata metadata;

    public SpawnMob()
    {
    }

    public SpawnMob(int entityId, UUID uuid, int type, Tuples.DoubleXYZ position, byte yaw, byte pitch, byte headPitch, Tuples.ShortXYZ velocity, soupply.java.Metadata metadata)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.type = type;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.headPitch = headPitch;
        this.velocity = velocity;
        this.metadata = metadata;
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
