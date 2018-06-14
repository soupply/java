package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class FullChunkData extends soupply.bedrock137.Packet
{

    public static final int ID = 58;

    public Tuples.IntXZ position;
    public soupply.bedrock137.type.ChunkData data;

    public FullChunkData()
    {
    }

    public FullChunkData(Tuples.IntXZ position, soupply.bedrock137.type.ChunkData data)
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
