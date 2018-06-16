package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnPlayer extends soupply.java335.Packet
{

    public static final int ID = 5;

    public int entityId;
    public UUID uuid;
    public Tuples.DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public soupply.java335.Metadata metadata;

    public SpawnPlayer()
    {
        this.position = new Tuples.DoubleXYZ();
        this.metadata = new soupply.java335.Metadata();
    }

    public SpawnPlayer(int entityId, UUID uuid, Tuples.DoubleXYZ position, byte yaw, byte pitch, soupply.java335.Metadata metadata)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
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
