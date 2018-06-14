package soupply.java315.type;

import java.util.*;
import soupply.util.*;

class ListAddPlayer extends Type
{

    // gamemode
    public static final int SURVIVAL = 0;
    public static final int CREATIVE = 1;
    public static final int ADVENTURE = 2;
    public static final int SPECTATOR = 3;

    public UUID uuid;
    public String name;
    public soupply.java315.type.Property[] properties;
    public int gamemode;
    public int latency;
    public boolean hasDisplayName;
    public String displayName;

    public ListAddPlayer()
    {
    }

    public ListAddPlayer(UUID uuid, String name, soupply.java315.type.Property[] properties, int gamemode, int latency, boolean hasDisplayName, String displayName)
    {
        this.uuid = uuid;
        this.name = name;
        this.properties = properties;
        this.gamemode = gamemode;
        this.latency = latency;
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
