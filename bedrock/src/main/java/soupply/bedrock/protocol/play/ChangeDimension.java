package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class ChangeDimension extends soupply.bedrock.Packet
{

    public static final int ID = 61;

    // dimension
    public static final int OVERWORLD = (int)0;
    public static final int NETHER = (int)1;
    public static final int END = (int)2;

    public int dimension;
    public FloatXYZ position;
    public boolean unknown2;

    public ChangeDimension()
    {
        this.position = new FloatXYZ();
    }

    public ChangeDimension(int dimension, FloatXYZ position, boolean unknown2)
    {
        this.dimension = dimension;
        this.position = position;
        this.unknown2 = unknown2;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarint(dimension);
        _buffer.writeLittleEndianFloat(position.x);
        _buffer.writeLittleEndianFloat(position.y);
        _buffer.writeLittleEndianFloat(position.z);
        _buffer.writeBool(unknown2);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        dimension = _buffer.readVarint();
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        unknown2 = _buffer.readBool();
    }

    public static ChangeDimension fromBuffer(byte[] buffer)
    {
        ChangeDimension packet = new ChangeDimension();
        packet.safeDecode(buffer);
        return packet;
    }

}
