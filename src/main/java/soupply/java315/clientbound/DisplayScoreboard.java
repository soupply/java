package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class DisplayScoreboard extends soupply.java315.Packet
{

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

}
