package soupply.java.metadata;

import java.util.*;
import soupply.util.*;

public class Metadata extends HashMap<Byte, MetadataValue>
{

    public void add(MetadataValue value)
    {
        this.put(value.id, value);
    }

    public void encodeBody(Buffer _buffer)
    {
        for(MetadataValue value : this.values())
        {
            value.encodeBody(_buffer);
        }
        _buffer.writeByte((byte)255);
    }

    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        while(true)
        {
            final byte id = _buffer.readByte();
            if(id == 255) break;
            final byte type = _buffer.readByte();
            MetadataValue value = getMetadataValue(id, type);
            value.decodeBody(_buffer);
            this.add(value);
        }
    }

    public static MetadataValue getMetadataValue(byte id, byte type)
    {
        switch(type)
        {
            case 0: return new MetadataByte(id);
            case 1: return new MetadataInt(id);
            case 2: return new MetadataFloat(id);
            case 3: return new MetadataString(id);
            case 4: return new MetadataChat(id);
            case 5: return new MetadataSlot(id);
            case 6: return new MetadataBool(id);
            case 7: return new MetadataRotation(id);
            case 8: return new MetadataPosition(id);
            case 9: return new MetadataOptionalPosition(id);
            case 10: return new MetadataDirection(id);
            case 11: return new MetadataUuid(id);
            case 12: return new MetadataBlock(id);
            case 13: return new MetadataNbt(id);
            default: return null;
        }
    }
}
