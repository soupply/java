package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class RequestChunkRadius extends soupply.bedrock150.Packet
{

    public static final int ID = 69;

    public int radius;

    public RequestChunkRadius()
    {
    }

    public RequestChunkRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarint(radius);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        radius = _buffer.readVarint();
    }

    public static RequestChunkRadius fromBuffer(byte[] buffer)
    {
        RequestChunkRadius packet = new RequestChunkRadius();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
