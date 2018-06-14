package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class DisplayScoreboard extends soupply.java340.Packet
{

    public static final int ID = 59;

    // position
    public static final byte LIST = 0;
    public static final byte SIDEBAR = 1;
    public static final byte BELOW_NAME = 2;

    public byte position;
    public String scoreName;

    public DisplayScoreboard()
    {
    }

    public DisplayScoreboard(byte position, String scoreName)
    {
        this.position = position;
        this.scoreName = scoreName;
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
