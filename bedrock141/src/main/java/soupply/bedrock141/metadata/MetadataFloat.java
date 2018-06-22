package soupply.bedrock141.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataFloat extends MetadataValue
{

    public float value;

    public MetadataFloat(int id, float value)
    {
        super(id, 3);
        this.value = value;
    }

    public MetadataFloat(int id)
    {
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeLittleEndianFloat(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        value = _buffer.readLittleEndianFloat();
    }

}
