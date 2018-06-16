package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class Statistics extends soupply.java315.Packet
{

    public static final int ID = 7;

    public soupply.java315.type.Statistic[] statistics;

    public Statistics()
    {
        this.statistics = new soupply.java315.type.Statistic[]();
    }

    public Statistics(soupply.java315.type.Statistic[] statistics)
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
