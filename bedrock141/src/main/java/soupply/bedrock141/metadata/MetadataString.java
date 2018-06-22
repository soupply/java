package soupply.bedrock141.metadata;

import java.util.*;
import soupply.util.*;

public class MetadataString extends MetadataValue
{

    public String value;

    public MetadataString(int id, String value)
    {
        super(id, 4);
        this.value = value;
    }

    public MetadataString(int id)
    {
        this(id, 0);
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
