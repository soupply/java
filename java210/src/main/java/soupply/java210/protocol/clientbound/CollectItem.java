package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class CollectItem extends soupply.java210.Packet
{

    public static final int ID = 72;

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
