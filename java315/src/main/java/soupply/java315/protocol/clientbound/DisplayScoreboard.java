package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class DisplayScoreboard extends soupply.java315.Packet
{

    public static final int ID = 56;

    // position
    public static final byte LIST = (byte)0;
    public static final byte SIDEBAR = (byte)1;
    public static final byte BELOW_NAME = (byte)2;

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
