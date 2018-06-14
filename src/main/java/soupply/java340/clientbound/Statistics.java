package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class Statistics extends soupply.java340.Packet
{

    public soupply.java340.type.Statistic[] statistics;

    public Statistics()
    {
    }

    public Statistics(soupply.java340.type.Statistic[] statistics)
    {
        this.statistics = statistics;
    }

}
