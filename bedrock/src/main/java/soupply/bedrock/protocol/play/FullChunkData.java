package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class FullChunkData extends soupply.bedrock.Packet
{

    public static final int ID = 58;

    public Tuples.IntXZ position;
    public soupply.bedrock.type.ChunkData data;

    public FullChunkData()
    {
        this.position = new Tuples.IntXZ();
        this.data = new soupply.bedrock.type.ChunkData();
    }

    public FullChunkData(Tuples.IntXZ position, soupply.bedrock.type.ChunkData data)
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
    public void decodeBody(Buffer buffer)
    {
    }

}
