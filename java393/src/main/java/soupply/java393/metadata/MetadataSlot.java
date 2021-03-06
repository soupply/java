package soupply.java393.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataSlot extends MetadataValue
{

    public soupply.java393.type.Slot value;

    public MetadataSlot(byte id, soupply.java393.type.Slot value)
    {
        super(id, (byte)6);
        this.value = value;
    }

    public MetadataSlot(byte id)
    {
        this(id, new soupply.java393.type.Slot());
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
