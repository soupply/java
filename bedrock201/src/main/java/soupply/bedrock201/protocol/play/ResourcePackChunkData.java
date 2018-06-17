package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePackChunkData extends soupply.bedrock201.Packet
{

    public static final int ID = 83;

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
