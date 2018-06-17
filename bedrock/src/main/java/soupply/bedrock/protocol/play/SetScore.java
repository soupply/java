package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetScore extends soupply.bedrock.Packet
{

    public static final int ID = 108;

    // type
    public static final byte MODIFY = (byte)0;
    public static final byte RESET = (byte)1;

    public byte type;
    public soupply.bedrock.type.Score[] scores;

    public SetScore()
    {
    }

    public SetScore(byte type, soupply.bedrock.type.Score[] scores)
    {
        this.type = type;
        this.scores = scores;
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
