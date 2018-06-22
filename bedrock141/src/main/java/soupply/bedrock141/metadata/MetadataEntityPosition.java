package soupply.bedrock141.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataEntityPosition extends MetadataValue
{

    public FloatXYZ value;

    public MetadataEntityPosition(int id, FloatXYZ value)
    {
        super(id, 8);
        this.value = value;
    }

    public MetadataEntityPosition(int id)
    {
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeLittleEndianFloat(value.x);
        _buffer.writeLittleEndianFloat(value.y);
        _buffer.writeLittleEndianFloat(value.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        value.x = _buffer.readLittleEndianFloat();
        value.y = _buffer.readLittleEndianFloat();
        value.z = _buffer.readLittleEndianFloat();
    }

}
