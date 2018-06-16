package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class AddPlayer extends soupply.bedrock.Packet
{

    public static final int ID = 12;

    public soupply.bedrock.type.McpeUuid uuid;
    public String username;
    public long entityId;
    public long runtimeId;
    public Tuples.FloatXYZ position;
    public Tuples.FloatXYZ motion;
    public float pitch;
    public float headYaw;
    public float yaw;
    public soupply.bedrock.type.Slot heldItem;
    public soupply.bedrock.Metadata metadata;
    public int unknown11;
    public int unknown12;
    public int unknown13;
    public int unknown14;
    public int unknown15;
    public long unknown16;
    public soupply.bedrock.type.Link[] links;

    public AddPlayer()
    {
        this.uuid = new soupply.bedrock.type.McpeUuid();
        this.position = new Tuples.FloatXYZ();
        this.motion = new Tuples.FloatXYZ();
        this.heldItem = new soupply.bedrock.type.Slot();
        this.metadata = new soupply.bedrock.Metadata();
        this.links = new soupply.bedrock.type.Link[]();
    }

    public AddPlayer(soupply.bedrock.type.McpeUuid uuid, String username, long entityId, long runtimeId, Tuples.FloatXYZ position, Tuples.FloatXYZ motion, float pitch, float headYaw, float yaw, soupply.bedrock.type.Slot heldItem, soupply.bedrock.Metadata metadata, int unknown11, int unknown12, int unknown13, int unknown14, int unknown15, long unknown16, soupply.bedrock.type.Link[] links)
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
