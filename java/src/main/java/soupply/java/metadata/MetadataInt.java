package soupply.java.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataInt extends MetadataValue
{

    public int value;

    public MetadataInt(byte id, int value)
    {
        super(id, 1);
        this.value = value;
    }

    public MetadataInt(byte id)
    {
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeVaruint(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        value = _buffer.readVaruint();
    }

}
