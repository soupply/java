package soupply.java338.type;

import java.util.*;
import soupply.util.*;

public class ListUpdateDisplayName extends Type
{

    public UUID uuid;
    public boolean hasDisplayName;
    public String displayName;

    public ListUpdateDisplayName()
    {
        this.uuid = new UUID(0, 0);
    }

    public ListUpdateDisplayName(UUID uuid, boolean hasDisplayName, String displayName)
    {
        this.uuid = uuid;
        this.hasDisplayName = hasDisplayName;
        this.displayName = displayName;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeUUID(uuid);
        _buffer.writeBool(hasDisplayName);
        if(hasDisplayName==true)
        {
            byte[] zlcxe5bu = _buffer.convertString(displayName);
            _buffer.writeVaruint((int)zlcxe5bu.length);
            _buffer.writeBytes(zlcxe5bu);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        uuid = _buffer.readUUID();
        hasDisplayName = _buffer.readBool();
        if(hasDisplayName==true)
        {
            final int bvzlcxe5 = _buffer.readVaruint();
            displayName = _buffer.readString(bvzlcxe5);
        }
    }

}
