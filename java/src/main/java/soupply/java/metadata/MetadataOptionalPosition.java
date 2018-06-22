package soupply.java.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataOptionalPosition extends MetadataValue
{

    public soupply.java.type.OptionalPosition value;

    public MetadataOptionalPosition(byte id, soupply.java.type.OptionalPosition value)
    {
        super(id, 9);
        this.value = value;
    }

    public MetadataOptionalPosition(byte id)
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
