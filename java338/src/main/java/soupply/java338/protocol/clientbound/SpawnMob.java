package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnMob extends soupply.java338.Packet
{

    public static final int ID = 3;

    public int entityId;
    public UUID uuid;
    public int type;
    public DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public byte headPitch;
    public ShortXYZ velocity;
    public soupply.java338.Metadata metadata;

    public SpawnMob()
    {
        this.uuid = new UUID();
        this.position = new DoubleXYZ();
        this.velocity = new ShortXYZ();
        this.metadata = new soupply.java338.Metadata();
    }

    public SpawnMob(int entityId, UUID uuid, int type, DoubleXYZ position, byte yaw, byte pitch, byte headPitch, ShortXYZ velocity, soupply.java338.Metadata metadata)
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
