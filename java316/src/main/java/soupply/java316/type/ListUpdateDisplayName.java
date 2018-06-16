package soupply.java316.type;

import java.util.*;
import soupply.util.*;

public class ListUpdateDisplayName extends Type
{

    public UUID uuid;
    public boolean hasDisplayName;
    public String displayName;

    public ListUpdateDisplayName()
    {
        this.uuid = new UUID();
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
