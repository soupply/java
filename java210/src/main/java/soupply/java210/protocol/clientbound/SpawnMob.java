package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnMob extends soupply.java210.Packet
{

    public static final int ID = 3;

    public int entityId;
    public UUID uuid;
    public byte type;
    public DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public byte headPitch;
    public ShortXYZ velocity;
    public soupply.java210.Metadata metadata;

    public SpawnMob()
    {
        this.uuid = new UUID();
        this.position = new DoubleXYZ();
        this.velocity = new ShortXYZ();
        this.metadata = new soupply.java210.Metadata();
    }

    public SpawnMob(int entityId, UUID uuid, byte type, DoubleXYZ position, byte yaw, byte pitch, byte headPitch, ShortXYZ velocity, soupply.java210.Metadata metadata)
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
