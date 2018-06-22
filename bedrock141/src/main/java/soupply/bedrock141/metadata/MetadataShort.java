package soupply.bedrock141.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataShort extends MetadataValue
{

    public short value;

    public MetadataShort(int id, short value)
    {
        super(id, 1);
        this.value = value;
    }

    public MetadataShort(int id)
    {
        this(id, 0);
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeLittleEndianShort(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        value = _buffer.readLittleEndianShort();
    }

}
