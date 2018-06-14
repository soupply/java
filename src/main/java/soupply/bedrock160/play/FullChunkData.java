package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class FullChunkData extends soupply.bedrock160.Packet
{

    public Tuples.IntXZ position;
    public soupply.bedrock160.type.ChunkData data;

    public FullChunkData()
    {
    }

    public FullChunkData(Tuples.IntXZ position, soupply.bedrock160.type.ChunkData data)
    {
        this.position = position;
        this.data = data;
    }

}
