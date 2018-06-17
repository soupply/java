package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class AddEntity extends soupply.bedrock141.Packet
{

    public static final int ID = 13;

    public long entityId;
    public long runtimeId;
    public int type;
    public FloatXYZ position;
    public FloatXYZ motion;
    public float pitch;
    public float yaw;
    public soupply.bedrock141.type.Attribute[] attributes;
    public soupply.bedrock141.Metadata metadata;
    public soupply.bedrock141.type.Link[] links;

    public AddEntity()
    {
        this.position = new FloatXYZ();
        this.motion = new FloatXYZ();
        this.metadata = new soupply.bedrock141.Metadata();
    }

    public AddEntity(long entityId, long runtimeId, int type, FloatXYZ position, FloatXYZ motion, float pitch, float yaw, soupply.bedrock141.type.Attribute[] attributes, soupply.bedrock141.Metadata metadata, soupply.bedrock141.type.Link[] links)
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
        _buffer.writeVarulong(runtimeId);
        _buffer.writeVaruint(type);
        _buffer.writeLittleEndianFloat(position.x);
        _buffer.writeLittleEndianFloat(position.y);
        _buffer.writeLittleEndianFloat(position.z);
        _buffer.writeLittleEndianFloat(motion.x);
        _buffer.writeLittleEndianFloat(motion.y);
        _buffer.writeLittleEndianFloat(motion.z);
        _buffer.writeLittleEndianFloat(pitch);
        _buffer.writeLittleEndianFloat(yaw);
        _buffer.writeVaruint((int)attributes.length);
        for(soupply.bedrock141.type.Attribute yrcldrc:attributes)
        {
            yrcldrc.encodeBody(_buffer);
        }
        metadata.encodeBody(_buffer);
        _buffer.writeVaruint((int)links.length);
        for(soupply.bedrock141.type.Link blam:links)
        {
            blam.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        runtimeId = _buffer.readVarulong();
        type = _buffer.readVaruint();
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        motion.x = _buffer.readLittleEndianFloat();
        motion.y = _buffer.readLittleEndianFloat();
        motion.z = _buffer.readLittleEndianFloat();
        pitch = _buffer.readLittleEndianFloat();
        yaw = _buffer.readLittleEndianFloat();
        final int bfdjyvzm = _buffer.readVaruint();
        attributes = new soupply.bedrock141.type.Attribute[bfdjyvzm];
        for(int yrcldrc=0;yrcldrc<attributes.length;yrcldrc++)
        {
            attributes[yrcldrc].decodeBody(_buffer);
        }
        metadata.decodeBody(_buffer);
        final int bxbt = _buffer.readVaruint();
        links = new soupply.bedrock141.type.Link[bxbt];
        for(int blam=0;blam<links.length;blam++)
        {
            links[blam].decodeBody(_buffer);
        }
    }

    public static AddEntity fromBuffer(byte[] buffer)
    {
        AddEntity packet = new AddEntity();
        packet.safeDecode(buffer);
        return packet;
    }

}
