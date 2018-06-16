package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class Statistics extends soupply.java335.Packet
{

    public static final int ID = 7;

    public soupply.java335.type.Statistic[] statistics;

    public Statistics()
    {
        this.statistics = new soupply.java335.type.Statistic[]();
    }

    public Statistics(soupply.java335.type.Statistic[] statistics)
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
