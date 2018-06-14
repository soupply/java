package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class CollectItem extends soupply.java210.Packet
{

    public int collected;
    public int collector;

    public CollectItem()
    {
    }

    public CollectItem(int collected, int collector)
    {
        this.collected = collected;
        this.collector = collector;
    }

}
