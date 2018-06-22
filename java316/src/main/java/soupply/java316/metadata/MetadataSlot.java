package soupply.java316.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataSlot extends MetadataValue
{

    public soupply.java316.type.Slot value;

    public MetadataSlot(byte id, soupply.java316.type.Slot value)
    {
        super(id, 5);
        this.value = value;
    }

    public MetadataSlot(byte id)
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
