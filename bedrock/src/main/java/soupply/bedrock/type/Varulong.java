package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class Varulong extends Type
{

    public String name;
    public short data;

    public Varulong()
    {
    }

    public Varulong(String name, short data)
    {
        this.name = name;
        this.data = data;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeLittleEndianShort(data);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        data = _buffer.readLittleEndianShort();
    }

}
