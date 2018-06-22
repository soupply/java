package soupply.java316.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataString extends MetadataValue
{

    public String value;

    public MetadataString(byte id, String value)
    {
        super(id, 3);
        this.value = value;
    }

    public MetadataString(byte id)
    {
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
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvdfdu = _buffer.readVaruint();
        value = _buffer.readString(bvdfdu);
    }

}
