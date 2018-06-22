package soupply.bedrock141.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataInt extends MetadataValue
{

    public int value;

    public MetadataInt(int id, int value)
    {
        super(id, 2);
        this.value = value;
    }

    public MetadataInt(int id)
    {
        this(id, (int)0);
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeVarint(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        value = _buffer.readVarint();
    }

}
