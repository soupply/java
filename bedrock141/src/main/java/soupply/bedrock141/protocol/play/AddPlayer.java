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
    public void encodeBody(Buffer _buffer)
    {
        uuid.encodeBody(_buffer);
        byte[] dnc5bu = _buffer.convertString(username);
        _buffer.writeVaruint((int)dnc5bu.length);
        _buffer.writeBytes(dnc5bu);
        _buffer.writeVarlong(entityId);
        _buffer.writeVarulong(runtimeId);
        _buffer.writeLittleEndianFloat(position.x);
        _buffer.writeLittleEndianFloat(position.y);
        _buffer.writeLittleEndianFloat(position.z);
        _buffer.writeLittleEndianFloat(motion.x);
        _buffer.writeLittleEndianFloat(motion.y);
        _buffer.writeLittleEndianFloat(motion.z);
        _buffer.writeLittleEndianFloat(pitch);
        _buffer.writeLittleEndianFloat(headYaw);
        _buffer.writeLittleEndianFloat(yaw);
        heldItem.encodeBody(_buffer);
        metadata.encodeBody(_buffer);
        _buffer.writeVaruint(unknown11);
        _buffer.writeVaruint(unknown12);
        _buffer.writeVaruint(unknown13);
        _buffer.writeVaruint(unknown14);
        _buffer.writeVaruint(unknown15);
        _buffer.writeLittleEndianLong(unknown16);
        _buffer.writeVaruint((int)links.length);
        for(soupply.bedrock141.type.Link blam:links)
        {
            blam.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        uuid.decodeBody(_buffer);
        final int bvdnc5bu = _buffer.readVaruint();
        username = _buffer.readString(bvdnc5bu);
        entityId = _buffer.readVarlong();
        runtimeId = _buffer.readVarulong();
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        motion.x = _buffer.readLittleEndianFloat();
        motion.y = _buffer.readLittleEndianFloat();
        motion.z = _buffer.readLittleEndianFloat();
        pitch = _buffer.readLittleEndianFloat();
        headYaw = _buffer.readLittleEndianFloat();
        yaw = _buffer.readLittleEndianFloat();
        heldItem.decodeBody(_buffer);
        metadata.decodeBody(_buffer);
        unknown11 = _buffer.readVaruint();
        unknown12 = _buffer.readVaruint();
        unknown13 = _buffer.readVaruint();
        unknown14 = _buffer.readVaruint();
        unknown15 = _buffer.readVaruint();
        unknown16 = _buffer.readLittleEndianLong();
        final int bxbt = _buffer.readVaruint();
        for(int blam=0;blam<links.length;blam++)
        {
            links[blam].decodeBody(_buffer);
        }
    }

    public static AddPlayer fromBuffer(byte[] buffer)
    {
        AddPlayer packet = new AddPlayer();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
