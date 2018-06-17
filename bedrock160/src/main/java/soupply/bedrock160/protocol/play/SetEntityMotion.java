package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetEntityMotion extends soupply.bedrock160.Packet
{

    public static final int ID = 40;

    public long entityId;
    public FloatXYZ motion;

    public SetEntityMotion()
    {
        this.motion = new FloatXYZ();
    }

    public SetEntityMotion(long entityId, FloatXYZ motion)
    {
        this.entityId = entityId;
        this.motion = motion;
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
        _buffer.writeLittleEndianFloat(motion.x);
        _buffer.writeLittleEndianFloat(motion.y);
        _buffer.writeLittleEndianFloat(motion.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        motion.x = _buffer.readLittleEndianFloat();
        motion.y = _buffer.readLittleEndianFloat();
        motion.z = _buffer.readLittleEndianFloat();
    }

    public static SetEntityMotion fromBuffer(byte[] buffer)
    {
        SetEntityMotion packet = new SetEntityMotion();
        packet.safeDecode(buffer);
        return packet;
    }

}
