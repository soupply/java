package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetDifficulty extends soupply.bedrock201.Packet
{

    public static final int ID = 60;

    // difficulty
    public static final int PEACEFUL = (int)0;
    public static final int EASY = (int)1;
    public static final int NORMAL = (int)2;
    public static final int HARD = (int)3;

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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(difficulty);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        difficulty = _buffer.readVaruint();
    }

    public static SetDifficulty fromBuffer(byte[] buffer)
    {
        SetDifficulty packet = new SetDifficulty();
        packet.safeDecode(buffer);
        return packet;
    }

}
