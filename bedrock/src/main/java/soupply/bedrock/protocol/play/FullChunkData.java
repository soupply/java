package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class FullChunkData extends soupply.bedrock.Packet
{

    public static final int ID = 58;

    public IntXZ position;
    public soupply.bedrock.type.ChunkData data;

    public FullChunkData()
    {
        this.position = new IntXZ();
        this.data = new soupply.bedrock.type.ChunkData();
    }

    public FullChunkData(IntXZ position, soupply.bedrock.type.ChunkData data)
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
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position.x = _buffer.readVarint();
        position.z = _buffer.readVarint();
        data.decodeBody(_buffer);
    }

    public static FullChunkData fromBuffer(byte[] buffer)
    {
        FullChunkData packet = new FullChunkData();
        packet.safeDecode(buffer);
        return packet;
    }

}
