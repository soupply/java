package soupply.java315.type;

import java.util.*;
import soupply.util.*;

public class ListAddPlayer extends Type
{

    // gamemode
    public static final int SURVIVAL = (int)0;
    public static final int CREATIVE = (int)1;
    public static final int ADVENTURE = (int)2;
    public static final int SPECTATOR = (int)3;

    public UUID uuid;
    public String name;
    public soupply.java315.type.Property[] properties;
    public int gamemode;
    public int latency;
    public boolean hasDisplayName;
    public String displayName;

    public ListAddPlayer()
    {
        this.uuid = new UUID();
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
