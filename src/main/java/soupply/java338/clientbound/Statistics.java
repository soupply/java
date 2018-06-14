package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class Statistics extends soupply.java338.Packet
{

    public soupply.java338.type.Statistic[] statistics;

    public Statistics()
    {
    }

    public Statistics(soupply.java338.type.Statistic[] statistics)
    {
        this.statistics = statistics;
    }

}
