package soupply.java.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataSlot extends MetadataValue
{

    public soupply.java.type.Slot value;

    public MetadataSlot(byte id, soupply.java.type.Slot value)
    {
        super(id, 5);
        this.value = value;
    }

    public MetadataSlot(byte id)
    {
        this(id, new soupply.java.type.Slot());
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
