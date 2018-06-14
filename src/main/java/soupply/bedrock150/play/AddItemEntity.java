package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class AddItemEntity extends soupply.bedrock150.Packet
{

    public long entityId;
    public long runtimeId;
    public soupply.bedrock150.type.Slot item;
    public Tuples.FloatXYZ position;
    public Tuples.FloatXYZ motion;
    public soupply.bedrock150.Metadata metadata;

    public AddItemEntity()
    {
    }

    public AddItemEntity(long entityId, long runtimeId, soupply.bedrock150.type.Slot item, Tuples.FloatXYZ position, Tuples.FloatXYZ motion, soupply.bedrock150.Metadata metadata)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.item = item;
        this.position = position;
        this.motion = motion;
        this.metadata = metadata;
    }

}
