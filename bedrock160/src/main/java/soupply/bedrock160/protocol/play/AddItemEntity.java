package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class AddItemEntity extends soupply.bedrock160.Packet
{

    public static final int ID = 15;

    public long entityId;
    public long runtimeId;
    public soupply.bedrock160.type.Slot item;
    public FloatXYZ position;
    public FloatXYZ motion;
    public soupply.bedrock160.Metadata metadata;

    public AddItemEntity()
    {
        this.item = new soupply.bedrock160.type.Slot();
        this.position = new FloatXYZ();
        this.motion = new FloatXYZ();
        this.metadata = new soupply.bedrock160.Metadata();
    }

    public AddItemEntity(long entityId, long runtimeId, soupply.bedrock160.type.Slot item, FloatXYZ position, FloatXYZ motion, soupply.bedrock160.Metadata metadata)
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
        _buffer.writeVarulong(runtimeId);
        item.encodeBody(_buffer);
        _buffer.writeLittleEndianFloat(position.x);
        _buffer.writeLittleEndianFloat(position.y);
        _buffer.writeLittleEndianFloat(position.z);
        _buffer.writeLittleEndianFloat(motion.x);
        _buffer.writeLittleEndianFloat(motion.y);
        _buffer.writeLittleEndianFloat(motion.z);
        metadata.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        runtimeId = _buffer.readVarulong();
        item.decodeBody(_buffer);
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        motion.x = _buffer.readLittleEndianFloat();
        motion.y = _buffer.readLittleEndianFloat();
        motion.z = _buffer.readLittleEndianFloat();
        metadata.decodeBody(_buffer);
    }

    public static AddItemEntity fromBuffer(byte[] buffer)
    {
        AddItemEntity packet = new AddItemEntity();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
