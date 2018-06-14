package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class Statistics extends soupply.java316.Packet
{

    public soupply.java316.type.Statistic[] statistics;

    public Statistics()
    {
    }

    public Statistics(soupply.java316.type.Statistic[] statistics)
    {
        this.statistics = statistics;
    }

}
