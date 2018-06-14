package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class AddItemEntity extends soupply.bedrock201.Packet
{

    public long entityId;
    public long runtimeId;
    public soupply.bedrock201.type.Slot item;
    public Tuples.FloatXYZ position;
    public Tuples.FloatXYZ motion;
    public soupply.bedrock201.Metadata metadata;

    public AddItemEntity()
    {
    }

    public AddItemEntity(long entityId, long runtimeId, soupply.bedrock201.type.Slot item, Tuples.FloatXYZ position, Tuples.FloatXYZ motion, soupply.bedrock201.Metadata metadata)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.item = item;
        this.position = position;
        this.motion = motion;
        this.metadata = metadata;
    }

}
