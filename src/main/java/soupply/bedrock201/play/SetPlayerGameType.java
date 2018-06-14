package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class SetPlayerGameType extends soupply.bedrock201.Packet
{

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

}
