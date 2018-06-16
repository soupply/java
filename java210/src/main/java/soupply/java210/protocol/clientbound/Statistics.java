package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class Statistics extends soupply.java210.Packet
{

    public static final int ID = 7;

    public soupply.java210.type.Statistic[] statistics;

    public Statistics()
    {
        this.statistics = new soupply.java210.type.Statistic[]();
    }

    public Statistics(soupply.java210.type.Statistic[] statistics)
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
