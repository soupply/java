package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class SetDefaultGameType extends soupply.bedrock137.Packet
{

    // game type
    public static final int SURVIVAL = 0;
    public static final int CREATIVE = 1;
    public static final int ADVENTURE = 2;

    public int gameType;

    public SetDefaultGameType()
    {
    }

    public SetDefaultGameType(int gameType)
    {
        this.gameType = gameType;
    }

}
