package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class AddItemEntity extends soupply.bedrock.Packet
{

    public static final int ID = 15;

    public long entityId;
    public long runtimeId;
    public soupply.bedrock.type.Slot item;
    public Tuples.FloatXYZ position;
    public Tuples.FloatXYZ motion;
    public soupply.bedrock.Metadata metadata;

    public AddItemEntity()
    {
        this.item = new soupply.bedrock.type.Slot();
        this.position = new Tuples.FloatXYZ();
        this.motion = new Tuples.FloatXYZ();
        this.metadata = new soupply.bedrock.Metadata();
    }

    public AddItemEntity(long entityId, long runtimeId, soupply.bedrock.type.Slot item, Tuples.FloatXYZ position, Tuples.FloatXYZ motion, soupply.bedrock.Metadata metadata)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.item = item;
        this.position = position;
        this.motion = motion;
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
