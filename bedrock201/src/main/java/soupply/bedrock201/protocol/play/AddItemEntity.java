package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

class AddItemEntity extends soupply.bedrock201.Packet
{

    public static final int ID = 15;

    public long entityId;
    public long runtimeId;
    public soupply.bedrock201.type.Slot item;
    public Tuples.FloatXYZ position;
    public Tuples.FloatXYZ motion;
    public soupply.bedrock201.Metadata metadata;

    public AddItemEntity()
    {
        this.item = new soupply.bedrock201.type.Slot();
        this.position = new Tuples.FloatXYZ();
        this.motion = new Tuples.FloatXYZ();
        this.metadata = new soupply.bedrock201.Metadata();
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
