package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class UnloadChunk extends soupply.java316.Packet
{

    public static final int ID = 29;

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
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.x = _buffer.readBigEndianInt();
        position.z = _buffer.readBigEndianInt();
    }

    public static UnloadChunk fromBuffer(byte[] buffer)
    {
        UnloadChunk packet = new UnloadChunk();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
