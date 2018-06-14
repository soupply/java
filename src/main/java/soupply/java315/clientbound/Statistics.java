package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class Statistics extends soupply.java315.Packet
{

    public soupply.java315.type.Statistic[] statistics;

    public Statistics()
    {
    }

    public Statistics(soupply.java315.type.Statistic[] statistics)
    {
        this.statistics = statistics;
    }

}
