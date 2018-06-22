package soupply.java315.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataFloat extends MetadataValue
{

    public float value;

    public MetadataFloat(byte id, float value)
    {
        super(id, 2);
        this.value = value;
    }

    public MetadataFloat(byte id)
    {
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeBigEndianFloat(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        value = _buffer.readBigEndianFloat();
    }

}
