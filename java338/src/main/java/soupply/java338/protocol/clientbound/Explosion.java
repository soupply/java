package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Explosion extends soupply.java338.Packet
{

    public static final int ID = 28;

    public FloatXYZ position;
    public float radius;
    public ByteXYZ[] records;
    public FloatXYZ motion;

    public Explosion()
    {
        this.position = new FloatXYZ();
        this.motion = new FloatXYZ();
    }

    public Explosion(FloatXYZ position, float radius, ByteXYZ[] records, FloatXYZ motion)
    {
        this.position = position;
        this.radius = radius;
        this.records = records;
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
        _buffer.writeBigEndianFloat(position.x);
        _buffer.writeBigEndianFloat(position.y);
        _buffer.writeBigEndianFloat(position.z);
        _buffer.writeBigEndianFloat(radius);
        _buffer.writeVaruint((int)records.length);
        for(ByteXYZ cvbjc:records)
        {
            _buffer.writeBigEndianByte(cvbjc.x);
            _buffer.writeBigEndianByte(cvbjc.y);
            _buffer.writeBigEndianByte(cvbjc.z);
        }
        _buffer.writeBigEndianFloat(motion.x);
        _buffer.writeBigEndianFloat(motion.y);
        _buffer.writeBigEndianFloat(motion.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.x = _buffer.readBigEndianFloat();
        position.y = _buffer.readBigEndianFloat();
        position.z = _buffer.readBigEndianFloat();
        radius = _buffer.readBigEndianFloat();
        final int bjy9zm = _buffer.readVaruint();
        for(int cvbjc=0;cvbjc<records.length;cvbjc++)
        {
            records[cvbjc].x = _buffer.readBigEndianByte();
            records[cvbjc].y = _buffer.readBigEndianByte();
            records[cvbjc].z = _buffer.readBigEndianByte();
        }
        motion.x = _buffer.readBigEndianFloat();
        motion.y = _buffer.readBigEndianFloat();
        motion.z = _buffer.readBigEndianFloat();
    }

    public static Explosion fromBuffer(byte[] buffer)
    {
        Explosion packet = new Explosion();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
