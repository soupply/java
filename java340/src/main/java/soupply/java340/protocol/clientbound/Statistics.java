package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Statistics extends soupply.java340.Packet
{

    public static final int ID = 7;

    public soupply.java340.type.Statistic[] statistics;

    public Statistics()
    {
    }

    public Statistics(soupply.java340.type.Statistic[] statistics)
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
