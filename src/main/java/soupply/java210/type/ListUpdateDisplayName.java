package soupply.java210.type;

import java.util.*;
import soupply.util.*;

class ListUpdateDisplayName extends Type
{

    public UUID uuid;
    public boolean hasDisplayName;
    public String displayName;

    public ListUpdateDisplayName()
    {
    }

    public ListUpdateDisplayName(UUID uuid, boolean hasDisplayName, String displayName)
    {
        this.uuid = uuid;
        this.hasDisplayName = hasDisplayName;
        this.displayName = displayName;
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
