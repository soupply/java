package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class AddItemEntity extends soupply.bedrock137.Packet
{

    public static final int ID = 15;

    public long entityId;
    public long runtimeId;
    public soupply.bedrock137.type.Slot item;
    public FloatXYZ position;
    public FloatXYZ motion;
    public soupply.bedrock137.Metadata metadata;

    public AddItemEntity()
    {
        this.item = new soupply.bedrock137.type.Slot();
        this.position = new FloatXYZ();
        this.motion = new FloatXYZ();
        this.metadata = new soupply.bedrock137.Metadata();
    }

    public AddItemEntity(long entityId, long runtimeId, soupply.bedrock137.type.Slot item, FloatXYZ position, FloatXYZ motion, soupply.bedrock137.Metadata metadata)
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
