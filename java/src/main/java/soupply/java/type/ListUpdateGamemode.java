package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class ListUpdateGamemode extends Type
{

    // gamemode
    public static final int SURVIVAL = (int)0;
    public static final int CREATIVE = (int)1;
    public static final int ADVENTURE = (int)2;
    public static final int SPECTATOR = (int)3;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
