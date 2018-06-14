package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class Statistics extends soupply.java335.Packet
{

    public soupply.java335.type.Statistic[] statistics;

    public Statistics()
    {
    }

    public Statistics(soupply.java335.type.Statistic[] statistics)
    {
        this.statistics = statistics;
    }

}
