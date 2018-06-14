package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class UpdateScore extends soupply.java335.Packet
{

    public static final int ID = 68;

    // action
    public static final byte UPDATE = 0;
    public static final byte REMOVE = 1;

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
    public void decodeBody(Buffer buffer)
    {
    }

}
