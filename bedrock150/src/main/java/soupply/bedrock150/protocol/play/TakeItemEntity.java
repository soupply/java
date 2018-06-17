package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class TakeItemEntity extends soupply.bedrock150.Packet
{

    public static final int ID = 17;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
