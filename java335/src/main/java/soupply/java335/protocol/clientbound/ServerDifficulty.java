package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class ServerDifficulty extends soupply.java335.Packet
{

    public static final int ID = 13;

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
