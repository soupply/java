package soupply.test0.metadata;

import java.util.*;
import soupply.util.*;

public class Metadata extends HashMap<Int, MetadataValue>
{

    public void add(MetadataValue value)
    {
        this.put(value.id, value);
    }

    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(this.size());
        for(MetadataValue value : this.values())
        {
            value.encodeBody(_buffer);
        }
    }

    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        int length = _buffer.readVaruint();
        while(length-- > 0)
        {
            final int id = _buffer.readVaruint();
            final int type = _buffer.readVaruint();
            MetadataValue value = getMetadataValue(id, type);
            value.decodeBody(_buffer);
            this.add(value);
        }
    }

    public static MetadataValue getMetadataValue(int id, int type)
    {
        switch(type)
        {
            case 0: return new MetadataByte(id);
            default: return null;
        }
    }
}
