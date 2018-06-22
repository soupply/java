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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(collected);
        _buffer.writeVarlong(collector);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        collected = _buffer.readVarlong();
        collector = _buffer.readVarlong();
    }

    public static TakeItemEntity fromBuffer(byte[] buffer)
    {
        TakeItemEntity packet = new TakeItemEntity();
        packet.safeDecode(buffer);
        return packet;
    }

}
