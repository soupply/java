package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class FullChunkData extends soupply.bedrock160.Packet
{

    public static final int ID = 58;

    public IntXZ position;
    public soupply.bedrock160.type.ChunkData data;

    public FullChunkData()
    {
        this.position = new IntXZ();
        this.data = new soupply.bedrock160.type.ChunkData();
    }

    public FullChunkData(IntXZ position, soupply.bedrock160.type.ChunkData data)
    {
        this.position = position;
        this.data = data;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarint(position.x);
        _buffer.writeVarint(position.z);
        data.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.x = _buffer.readVarint();
        position.z = _buffer.readVarint();
        data.decodeBody(_buffer);
    }

    public static FullChunkData fromBuffer(byte[] buffer)
    {
        FullChunkData packet = new FullChunkData();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
