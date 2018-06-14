package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class CollectItem extends soupply.java340.Packet
{

    public int collected;
    public int collector;
    public int count;

    public CollectItem()
    {
    }

    public CollectItem(int collected, int collector, int count)
    {
        this.collected = collected;
        this.collector = collector;
        this.count = count;
    }

}
