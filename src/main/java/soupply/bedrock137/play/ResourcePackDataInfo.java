package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class ResourcePackDataInfo extends soupply.bedrock137.Packet
{

    public String id;
    public int maxChunkSize;
    public int chunkCount;
    public long compressedPackSize;
    public String sha256;

    public ResourcePackDataInfo()
    {
    }

    public ResourcePackDataInfo(String id, int maxChunkSize, int chunkCount, long compressedPackSize, String sha256)
    {
        this.id = id;
        this.maxChunkSize = maxChunkSize;
        this.chunkCount = chunkCount;
        this.compressedPackSize = compressedPackSize;
        this.sha256 = sha256;
    }

}
