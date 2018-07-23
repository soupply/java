package soupply.java.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataOptionalChat extends MetadataValue
{

    public soupply.java.type.OptionalChat value;

    public MetadataOptionalChat(byte id, soupply.java.type.OptionalChat value)
    {
        super(id, (byte)5);
        this.value = value;
    }

    public MetadataOptionalChat(byte id)
    {
        this(id, new soupply.java.type.OptionalChat());
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
