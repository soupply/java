package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnMob extends soupply.java335.Packet
{

    public int entityId;
    public UUID uuid;
    public int type;
    public Tuples.DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public byte headPitch;
    public Tuples.ShortXYZ velocity;
    public soupply.java335.Metadata metadata;

    public SpawnMob()
    {
    }

    public SpawnMob(int entityId, UUID uuid, int type, Tuples.DoubleXYZ position, byte yaw, byte pitch, byte headPitch, Tuples.ShortXYZ velocity, soupply.java335.Metadata metadata)
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

}
