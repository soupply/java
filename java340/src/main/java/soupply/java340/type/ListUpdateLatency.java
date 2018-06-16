package soupply.java340.type;

import java.util.*;
import soupply.util.*;

class ListUpdateLatency extends Type
{

    public UUID uuid;
    public int latency;

    public ListUpdateLatency()
    {
    }

    public ListUpdateLatency(UUID uuid, int latency)
    {
        this.uuid = uuid;
        this.latency = latency;
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
