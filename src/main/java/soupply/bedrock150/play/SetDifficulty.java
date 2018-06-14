package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class SetDifficulty extends soupply.bedrock150.Packet
{

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

}
