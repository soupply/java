package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class ResourcePackDataInfo extends soupply.bedrock.Packet
{

    public static final int ID = 82;

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
