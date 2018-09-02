package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class NetworkStackLatency extends soupply.bedrock282.Packet
{

    public static final int ID = 115;

    public long timestamp;

    public NetworkStackLatency()
    {
    }

    public NetworkStackLatency(long timestamp)
    {
        this.timestamp = timestamp;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeLittleEndianLong(timestamp);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        timestamp = _buffer.readLittleEndianLong();
    }

    public static NetworkStackLatency fromBuffer(byte[] buffer)
    {
        NetworkStackLatency packet = new NetworkStackLatency();
        packet.safeDecode(buffer);
        return packet;
    }

}
