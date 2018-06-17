package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class OptionalUuid extends Type
{

    public boolean hasUuid;
    public UUID uuid;

    public OptionalUuid()
    {
        this.uuid = new UUID(0, 0);
    }

    public OptionalUuid(boolean hasUuid, UUID uuid)
    {
        this.hasUuid = hasUuid;
        this.uuid = uuid;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(hasUuid);
        _buffer.writeUUID(uuid);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        hasUuid = _buffer.readBool();
        uuid = _buffer.readUUID();
    }

}
