package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class SetDifficulty extends soupply.bedrock.Packet
{

    public static final int ID = 60;

    // difficulty
    public static final int PEACEFUL = 0;
    public static final int EASY = 1;
    public static final int NORMAL = 2;
    public static final int HARD = 3;

    public int difficulty;

    public SetDifficulty()
    {
    }

    public SetDifficulty(int difficulty)
    {
        this.difficulty = difficulty;
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
