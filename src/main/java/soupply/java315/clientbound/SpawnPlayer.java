package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnPlayer extends soupply.java315.Packet
{

    public int entityId;
    public UUID uuid;
    public Tuples.DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public soupply.java315.Metadata metadata;

    public SpawnPlayer()
    {
    }

    public SpawnPlayer(int entityId, UUID uuid, Tuples.DoubleXYZ position, byte yaw, byte pitch, soupply.java315.Metadata metadata)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.metadata = metadata;
    }

}
