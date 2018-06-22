package soupply.java338.metadata;

import java.util.*;
import soupply.util.*;

public abstract class MetadataValue
{

    public byte id;
    private byte type;

    public MetadataValue(byte id, byte type)
    {
        this.id = id;
        this.type = type;
    }

    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(id);
        _buffer.writeByte(type);
    }

    public abstract void decodeBody(Buffer _buffer) throws DecodeException;
}
