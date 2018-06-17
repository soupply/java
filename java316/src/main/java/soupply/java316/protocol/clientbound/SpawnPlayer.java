package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnPlayer extends soupply.java316.Packet
{

    public static final int ID = 5;

    public int entityId;
    public UUID uuid;
    public DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public soupply.java316.Metadata metadata;

    public SpawnPlayer()
    {
        this.uuid = new UUID();
        this.position = new DoubleXYZ();
        this.metadata = new soupply.java316.Metadata();
    }

    public SpawnPlayer(int entityId, UUID uuid, DoubleXYZ position, byte yaw, byte pitch, soupply.java316.Metadata metadata)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
