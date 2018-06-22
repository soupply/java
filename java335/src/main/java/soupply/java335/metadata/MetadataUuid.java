package soupply.java335.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataUuid extends MetadataValue
{

    public soupply.java335.type.OptionalUuid value;

    public MetadataUuid(byte id, soupply.java335.type.OptionalUuid value)
    {
        super(id, 11);
        this.value = value;
    }

    public MetadataUuid(byte id)
    {
        this(id, new soupply.java335.type.OptionalUuid());
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
