package soupply.java340.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataBool extends MetadataValue
{

    public boolean value;

    public MetadataBool(byte id, boolean value)
    {
        super(id, 6);
        this.value = value;
    }

    public MetadataBool(byte id)
    {
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeBool(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        value = _buffer.readBool();
    }

}
