package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class AddEntity extends soupply.bedrock201.Packet
{

    public long entityId;
    public long runtimeId;
    public int type;
    public Tuples.FloatXYZ position;
    public Tuples.FloatXYZ motion;
    public float pitch;
    public float yaw;
    public soupply.bedrock201.type.Attribute[] attributes;
    public soupply.bedrock201.Metadata metadata;
    public soupply.bedrock201.type.Link[] links;

    public AddEntity()
    {
    }

    public AddEntity(long entityId, long runtimeId, int type, Tuples.FloatXYZ position, Tuples.FloatXYZ motion, float pitch, float yaw, soupply.bedrock201.type.Attribute[] attributes, soupply.bedrock201.Metadata metadata, soupply.bedrock201.type.Link[] links)
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
