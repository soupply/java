package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class FullChunkData extends soupply.bedrock137.Packet
{

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

}
