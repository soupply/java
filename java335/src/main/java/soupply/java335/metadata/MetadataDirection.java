package soupply.java335.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataDirection extends MetadataValue
{

    public int value;

    public MetadataDirection(byte id, int value)
    {
        super(id, 10);
        this.value = value;
    }

    public MetadataDirection(byte id)
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
