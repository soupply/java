package soupply.java210.type;

import java.util.*;
import soupply.util.*;

public class ListUpdateGamemode extends Type
{

    // gamemode
    public static final int SURVIVAL = 0;
    public static final int CREATIVE = 1;
    public static final int ADVENTURE = 2;
    public static final int SPECTATOR = 3;

    public UUID uuid;
    public int gamemode;

    public ListUpdateGamemode()
    {
        this.uuid = new UUID();
    }

    public ListUpdateGamemode(UUID uuid, int gamemode)
    {
        this.uuid = uuid;
        this.gamemode = gamemode;
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
