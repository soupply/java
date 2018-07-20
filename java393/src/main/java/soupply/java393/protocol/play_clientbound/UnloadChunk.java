package soupply.java393.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class UnloadChunk extends soupply.java393.Packet
{

    public static final int ID = 31;

    public IntXZ position;

    public UnloadChunk()
    {
        this.position = new IntXZ();
    }

    public UnloadChunk(IntXZ position)
    {
        this.position = position;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianInt(position.x);
        _buffer.writeBigEndianInt(position.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position.x = _buffer.readBigEndianInt();
        position.z = _buffer.readBigEndianInt();
    }

    public static UnloadChunk fromBuffer(byte[] buffer)
    {
        UnloadChunk packet = new UnloadChunk();
        packet.safeDecode(buffer);
        return packet;
    }

}
