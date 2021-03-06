package soupply.java335.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataOptionalPosition extends MetadataValue
{

    public soupply.java335.type.OptionalPosition value;

    public MetadataOptionalPosition(byte id, soupply.java335.type.OptionalPosition value)
    {
        super(id, (byte)9);
        this.value = value;
    }

    public MetadataOptionalPosition(byte id)
    {
        this(id, new soupply.java335.type.OptionalPosition());
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
