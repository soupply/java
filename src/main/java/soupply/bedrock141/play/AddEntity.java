package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class AddEntity extends soupply.bedrock141.Packet
{

    public long entityId;
    public long runtimeId;
    public int type;
    public Tuples.FloatXYZ position;
    public Tuples.FloatXYZ motion;
    public float pitch;
    public float yaw;
    public soupply.bedrock141.type.Attribute[] attributes;
    public soupply.bedrock141.Metadata metadata;
    public soupply.bedrock141.type.Link[] links;

    public AddEntity()
    {
    }

    public AddEntity(long entityId, long runtimeId, int type, Tuples.FloatXYZ position, Tuples.FloatXYZ motion, float pitch, float yaw, soupply.bedrock141.type.Attribute[] attributes, soupply.bedrock141.Metadata metadata, soupply.bedrock141.type.Link[] links)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.type = type;
        this.position = position;
        this.motion = motion;
        this.pitch = pitch;
        this.yaw = yaw;
        this.attributes = attributes;
        this.metadata = metadata;
        this.links = links;
    }

}
