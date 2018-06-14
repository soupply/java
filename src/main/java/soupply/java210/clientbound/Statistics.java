package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class Statistics extends soupply.java210.Packet
{

    public soupply.java210.type.Statistic[] statistics;

    public Statistics()
    {
    }

    public Statistics(soupply.java210.type.Statistic[] statistics)
    {
        this.statistics = statistics;
    }

}
