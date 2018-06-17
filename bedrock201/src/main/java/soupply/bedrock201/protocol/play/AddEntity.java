package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class AddEntity extends soupply.bedrock201.Packet
{

    public static final int ID = 13;

    public long entityId;
    public long runtimeId;
    public int type;
    public FloatXYZ position;
    public FloatXYZ motion;
    public float pitch;
    public float yaw;
    public soupply.bedrock201.type.Attribute[] attributes;
    public soupply.bedrock201.Metadata metadata;
    public soupply.bedrock201.type.Link[] links;

    public AddEntity()
    {
        this.position = new FloatXYZ();
        this.motion = new FloatXYZ();
        this.metadata = new soupply.bedrock201.Metadata();
    }

    public AddEntity(long entityId, long runtimeId, int type, FloatXYZ position, FloatXYZ motion, float pitch, float yaw, soupply.bedrock201.type.Attribute[] attributes, soupply.bedrock201.Metadata metadata, soupply.bedrock201.type.Link[] links)
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
