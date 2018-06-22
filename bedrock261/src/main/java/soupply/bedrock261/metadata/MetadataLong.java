package soupply.bedrock261.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataLong extends MetadataValue
{

    public long value;

    public MetadataLong(int id, long value)
    {
        super(id, 7);
        this.value = value;
    }

    public MetadataLong(int id)
    {
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeVarlong(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        value = _buffer.readVarlong();
    }

}
