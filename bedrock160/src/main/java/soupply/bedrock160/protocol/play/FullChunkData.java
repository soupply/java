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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
