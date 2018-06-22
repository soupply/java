package soupply.java338.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataNbt extends MetadataValue
{

    public byte[] value;

    public MetadataNbt(byte id, byte[] value)
    {
        super(id, 13);
        this.value = value;
    }

    public MetadataNbt(byte id)
    {
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeBytes(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        value = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

}
