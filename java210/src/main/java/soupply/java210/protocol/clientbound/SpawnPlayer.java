package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnPlayer extends soupply.java210.Packet
{

    public static final int ID = 5;

    public int entityId;
    public UUID uuid;
    public DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public soupply.java210.Metadata metadata;

    public SpawnPlayer()
    {
        this.uuid = new UUID();
        this.position = new DoubleXYZ();
        this.metadata = new soupply.java210.Metadata();
    }

    public SpawnPlayer(int entityId, UUID uuid, DoubleXYZ position, byte yaw, byte pitch, soupply.java210.Metadata metadata)
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
