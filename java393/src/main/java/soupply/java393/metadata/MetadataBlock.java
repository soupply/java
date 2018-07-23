package soupply.java393.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataBlock extends MetadataValue
{

    public int value;

    public MetadataBlock(byte id, int value)
    {
        super(id, (byte)13);
        this.value = value;
    }

    public MetadataBlock(byte id)
    {
        this(id, (int)0);
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
