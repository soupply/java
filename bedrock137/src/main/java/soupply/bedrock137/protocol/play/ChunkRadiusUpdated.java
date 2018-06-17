package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class ChunkRadiusUpdated extends soupply.bedrock137.Packet
{

    public static final int ID = 70;

    public int radius;

    public ChunkRadiusUpdated()
    {
    }

    public ChunkRadiusUpdated(int radius)
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

    public static ChunkRadiusUpdated fromBuffer(byte[] buffer)
    {
        ChunkRadiusUpdated packet = new ChunkRadiusUpdated();
        packet.safeDecode(buffer);
        return packet;
    }

}
