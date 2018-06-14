package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class ServerDifficulty extends soupply.java315.Packet
{

    // difficulty
    public static final byte PEACEFUL = 0;
    public static final byte EASY = 1;
    public static final byte NORMAL = 2;
    public static final byte HARD = 3;

    public byte difficulty;

    public ServerDifficulty()
    {
    }

    public ServerDifficulty(byte difficulty)
    {
        this.difficulty = difficulty;
    }

}
