package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class CollectItem extends soupply.java.Packet
{

    public static final int ID = 79;

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

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(collected);
        _buffer.writeVaruint(collector);
        _buffer.writeVaruint(count);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        collected = _buffer.readVaruint();
        collector = _buffer.readVaruint();
        count = _buffer.readVaruint();
    }

    public static CollectItem fromBuffer(byte[] buffer)
    {
        CollectItem packet = new CollectItem();
        packet.safeDecode(buffer);
        return packet;
    }

}
