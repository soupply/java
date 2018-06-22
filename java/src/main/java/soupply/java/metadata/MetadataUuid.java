package soupply.java.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataUuid extends MetadataValue
{

    public soupply.java.type.OptionalUuid value;

    public MetadataUuid(byte id, soupply.java.type.OptionalUuid value)
    {
        super(id, 11);
        this.value = value;
    }

    public MetadataUuid(byte id)
    {
        this(id, new soupply.java.type.OptionalUuid());
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
