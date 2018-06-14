package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class FullChunkData extends soupply.bedrock201.Packet
{

    public Tuples.IntXZ position;
    public soupply.bedrock201.type.ChunkData data;

    public FullChunkData()
    {
    }

    public FullChunkData(Tuples.IntXZ position, soupply.bedrock201.type.ChunkData data)
    {
        this.position = position;
        this.data = data;
    }

}
