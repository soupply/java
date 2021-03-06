package soupply.java.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataChat extends MetadataValue
{

    public String value;

    public MetadataChat(byte id, String value)
    {
        super(id, (byte)4);
        this.value = value;
    }

    public MetadataChat(byte id)
    {
        this(id, "");
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        super.encodeBody(_buffer);
        byte[] dfdu = _buffer.convertString(value);
        _buffer.writeVaruint((int)dfdu.length);
        _buffer.writeBytes(dfdu);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvdfdu = _buffer.readVaruint();
        value = _buffer.readString(bvdfdu);
    }

}
