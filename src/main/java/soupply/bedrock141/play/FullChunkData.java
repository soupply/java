package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class FullChunkData extends soupply.bedrock141.Packet
{

    public Tuples.IntXZ position;
    public soupply.bedrock141.type.ChunkData data;

    public FullChunkData()
    {
    }

    public FullChunkData(Tuples.IntXZ position, soupply.bedrock141.type.ChunkData data)
    {
        this.position = position;
        this.data = data;
    }

}
