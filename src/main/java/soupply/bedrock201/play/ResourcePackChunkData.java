package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class ResourcePackChunkData extends soupply.bedrock201.Packet
{

    public String id;
    public int chunkIndex;
    public long progress;
    public byte[] data;

    public ResourcePackChunkData()
    {
    }

    public ResourcePackChunkData(String id, int chunkIndex, long progress, byte[] data)
    {
        this.id = id;
        this.chunkIndex = chunkIndex;
        this.progress = progress;
        this.data = data;
    }

}
