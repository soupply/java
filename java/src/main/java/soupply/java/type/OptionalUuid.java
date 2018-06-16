package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class OptionalUuid extends Type
{

    public boolean hasUuid;
    public UUID uuid;

    public OptionalUuid()
    {
        this.uuid = new UUID();
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
