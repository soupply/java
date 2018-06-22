package soupply.bedrock160.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataSlot extends MetadataValue
{

    public soupply.bedrock160.type.Slot value;

    public MetadataSlot(int id, soupply.bedrock160.type.Slot value)
    {
        super(id, 5);
        this.value = value;
    }

    public MetadataSlot(int id)
    {
        this(id, new soupply.bedrock160.type.Slot());
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        value.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        value.decodeBody(_buffer);
    }

}
