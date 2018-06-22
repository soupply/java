package soupply.java335.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataRotation extends MetadataValue
{

    public FloatXYZ value;

    public MetadataRotation(byte id, FloatXYZ value)
    {
        super(id, 7);
        this.value = value;
    }

    public MetadataRotation(byte id)
    {
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeBigEndianFloat(value.x);
        _buffer.writeBigEndianFloat(value.y);
        _buffer.writeBigEndianFloat(value.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        value.x = _buffer.readBigEndianFloat();
        value.y = _buffer.readBigEndianFloat();
        value.z = _buffer.readBigEndianFloat();
    }

}
