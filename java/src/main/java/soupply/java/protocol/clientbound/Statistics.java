package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class Statistics extends soupply.java.Packet
{

    public static final int ID = 7;

    public soupply.java.type.Statistic[] statistics;

    public Statistics()
    {
    }

    public Statistics(soupply.java.type.Statistic[] statistics)
    {
        this.statistics = statistics;
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
