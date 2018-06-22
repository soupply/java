package soupply.bedrock261.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataSlot extends MetadataValue
{

    public soupply.bedrock261.type.Slot value;

    public MetadataSlot(int id, soupply.bedrock261.type.Slot value)
    {
        super(id, 5);
        this.value = value;
    }

    public MetadataSlot(int id)
    {
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        value.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        value.decodeBody(_buffer);
    }

}
