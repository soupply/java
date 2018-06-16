package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnObject extends soupply.java210.Packet
{

    public static final int ID = 0;

    public int entityId;
    public UUID uuid;
    public byte type;
    public DoubleXYZ position;
    public byte pitch;
    public byte yaw;
    public int data;
    public ShortXYZ velocity;

    public SpawnObject()
    {
        this.uuid = new UUID();
        this.position = new DoubleXYZ();
        this.velocity = new ShortXYZ();
    }

    public SpawnObject(int entityId, UUID uuid, byte type, DoubleXYZ position, byte pitch, byte yaw, int data, ShortXYZ velocity)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.type = type;
        this.position = position;
        this.pitch = pitch;
        this.yaw = yaw;
        this.data = data;
        this.velocity = velocity;
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
