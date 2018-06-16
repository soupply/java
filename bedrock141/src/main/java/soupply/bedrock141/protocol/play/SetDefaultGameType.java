package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetDefaultGameType extends soupply.bedrock141.Packet
{

    public static final int ID = 105;

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
