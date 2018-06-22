package soupply.java340.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataPosition extends MetadataValue
{

    public long value;

    public MetadataPosition(byte id, long value)
    {
        super(id, (byte)8);
        this.value = value;
    }

    public MetadataPosition(byte id)
    {
        this(id, (long)0);
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeBigEndianLong(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        value = _buffer.readBigEndianLong();
    }

}
