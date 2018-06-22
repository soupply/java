package soupply.java315.metadata;

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
        this(id, 0);
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeVaruint(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        value = _buffer.readVaruint();
    }

}
