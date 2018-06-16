package soupply.java.type;

import java.util.*;
import soupply.util.*;

class OptionalUuid extends Type
{

    public boolean hasUuid;
    public UUID uuid;

    public OptionalUuid()
    {
    }

    public OptionalUuid(boolean hasUuid, UUID uuid)
    {
        this.hasUuid = hasUuid;
        this.uuid = uuid;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
