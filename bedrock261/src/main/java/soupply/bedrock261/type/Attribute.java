package soupply.bedrock261.type;

import java.util.*;
import soupply.util.*;

public class Attribute extends Type
{

    public float min;
    public float max;
    public float value;
    public float default_;
    public String name;

    public Attribute()
    {
    }

    public Attribute(float min, float max, float value, float default_, String name)
    {
        this.min = min;
        this.max = max;
        this.value = value;
        this.default_ = default_;
        this.name = name;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeLittleEndianFloat(min);
        _buffer.writeLittleEndianFloat(max);
        _buffer.writeLittleEndianFloat(value);
        _buffer.writeLittleEndianFloat(default_);
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        min = _buffer.readLittleEndianFloat();
        max = _buffer.readLittleEndianFloat();
        value = _buffer.readLittleEndianFloat();
        default_ = _buffer.readLittleEndianFloat();
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
    }

}
