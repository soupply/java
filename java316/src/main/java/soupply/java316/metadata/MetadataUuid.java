package soupply.java316.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataUuid extends MetadataValue
{

    public soupply.java316.type.OptionalUuid value;

    public MetadataUuid(byte id, soupply.java316.type.OptionalUuid value)
    {
        super(id, 11);
        this.value = value;
    }

    public MetadataUuid(byte id)
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
