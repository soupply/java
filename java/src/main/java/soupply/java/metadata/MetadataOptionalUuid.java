package soupply.java.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataOptionalUuid extends MetadataValue
{

    public soupply.java.type.OptionalUuid value;

    public MetadataOptionalUuid(byte id, soupply.java.type.OptionalUuid value)
    {
        super(id, (byte)12);
        this.value = value;
    }

    public MetadataOptionalUuid(byte id)
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
