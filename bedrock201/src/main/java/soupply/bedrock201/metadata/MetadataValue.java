package soupply.bedrock201.metadata;

import java.util.*;
import soupply.util.*;

public abstract class MetadataValue
{

    public int id;
    private int type;

    public MetadataValue(int id, int type)
    {
        this.id = id;
        this.type = type;
    }

    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(id);
        _buffer.writeVaruint(type);
    }

    public abstract void decodeBody(Buffer _buffer) throws BufferOverflowException;
}
