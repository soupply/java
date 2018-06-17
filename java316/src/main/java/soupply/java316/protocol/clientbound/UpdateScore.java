package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class UpdateScore extends soupply.java316.Packet
{

    public static final int ID = 66;

    // action
    public static final byte UPDATE = (byte)0;
    public static final byte REMOVE = (byte)1;

    public String scoreName;
    public byte action;
    public String objectiveName;
    public int value;

    public UpdateScore()
    {
    }

    public UpdateScore(String scoreName, byte action, String objectiveName, int value)
    {
        this.scoreName = scoreName;
        this.action = action;
        this.objectiveName = objectiveName;
        this.value = value;
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
