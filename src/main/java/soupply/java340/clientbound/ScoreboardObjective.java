package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class ScoreboardObjective extends soupply.java340.Packet
{

    // mode
    public static final byte CREATE = 0;
    public static final byte REMOVE = 1;
    public static final byte UPDATE = 2;

    // type
    public static final String NUMERIC = "integer";
    public static final String GRAPHIC = "hearts";

    public String name;
    public byte mode;
    public String value;
    public String type;

    public ScoreboardObjective()
    {
    }

    public ScoreboardObjective(String name, byte mode, String value, String type)
    {
        this.name = name;
        this.mode = mode;
        this.value = value;
        this.type = type;
    }

}
