package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetPlayerGameType extends soupply.bedrock141.Packet
{

    public static final int ID = 62;

    // gamemode
    public static final int SURVIVAL = 0;
    public static final int CREATIVE = 1;
    public static final int ADVENTURE = 2;

    public int gamemode;

    public SetPlayerGameType()
    {
    }

    public SetPlayerGameType(int gamemode)
    {
        this.gamemode = gamemode;
    }

    @Override
    public int getId()
    {
        return ID;
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
