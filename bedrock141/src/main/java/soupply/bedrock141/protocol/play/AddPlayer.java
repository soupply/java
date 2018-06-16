package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class AddPlayer extends soupply.bedrock141.Packet
{

    public static final int ID = 12;

    public soupply.bedrock141.type.McpeUuid uuid;
    public String username;
    public long entityId;
    public long runtimeId;
    public FloatXYZ position;
    public FloatXYZ motion;
    public float pitch;
    public float headYaw;
    public float yaw;
    public soupply.bedrock141.type.Slot heldItem;
    public soupply.bedrock141.Metadata metadata;
    public int unknown11;
    public int unknown12;
    public int unknown13;
    public int unknown14;
    public int unknown15;
    public long unknown16;
    public soupply.bedrock141.type.Link[] links;

    public AddPlayer()
    {
        this.uuid = new soupply.bedrock141.type.McpeUuid();
        this.position = new FloatXYZ();
        this.motion = new FloatXYZ();
        this.heldItem = new soupply.bedrock141.type.Slot();
        this.metadata = new soupply.bedrock141.Metadata();
    }

    public AddPlayer(soupply.bedrock141.type.McpeUuid uuid, String username, long entityId, long runtimeId, FloatXYZ position, FloatXYZ motion, float pitch, float headYaw, float yaw, soupply.bedrock141.type.Slot heldItem, soupply.bedrock141.Metadata metadata, int unknown11, int unknown12, int unknown13, int unknown14, int unknown15, long unknown16, soupply.bedrock141.type.Link[] links)
    {
        this.uuid = uuid;
        this.username = username;
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.position = position;
        this.motion = motion;
        this.pitch = pitch;
        this.headYaw = headYaw;
        this.yaw = yaw;
        this.heldItem = heldItem;
        this.metadata = metadata;
        this.unknown11 = unknown11;
        this.unknown12 = unknown12;
        this.unknown13 = unknown13;
        this.unknown14 = unknown14;
        this.unknown15 = unknown15;
        this.unknown16 = unknown16;
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
    public void decodeBody(Buffer buffer)
    {
    }

}
