package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class TakeItemEntity extends soupply.bedrock137.Packet
{

    public long collected;
    public long collector;

    public TakeItemEntity()
    {
    }

    public TakeItemEntity(long collected, long collector)
    {
        this.collected = collected;
        this.collector = collector;
    }

}
