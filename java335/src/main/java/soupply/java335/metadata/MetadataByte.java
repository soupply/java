package soupply.java335.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataByte extends MetadataValue
{

    public byte value;

    public MetadataByte(byte id, byte value)
    {
        super(id, 0);
        this.value = value;
    }

    public MetadataByte(byte id)
    {
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeByte(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        value = _buffer.readByte();
    }

}
