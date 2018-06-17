package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class ServerDifficulty extends soupply.java338.Packet
{

    public static final int ID = 13;

    // difficulty
    public static final byte PEACEFUL = (byte)0;
    public static final byte EASY = (byte)1;
    public static final byte NORMAL = (byte)2;
    public static final byte HARD = (byte)3;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
