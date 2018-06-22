package soupply.bedrock261.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataBlockPosition extends MetadataValue
{

    public IntXYZ value;

    public MetadataBlockPosition(int id, IntXYZ value)
    {
        super(id, 6);
        this.value = value;
    }

    public MetadataBlockPosition(int id)
    {
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        _buffer.writeVarint(value.x);
        _buffer.writeVarint(value.y);
        _buffer.writeVarint(value.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        value.x = _buffer.readVarint();
        value.y = _buffer.readVarint();
        value.z = _buffer.readVarint();
    }

}
