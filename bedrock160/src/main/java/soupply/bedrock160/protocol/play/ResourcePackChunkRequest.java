package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePackChunkRequest extends soupply.bedrock160.Packet
{

    public static final int ID = 84;

    public String id;
    public int chunkIndex;

    public ResourcePackChunkRequest()
    {
    }

    public ResourcePackChunkRequest(String id, int chunkIndex)
    {
        this.id = id;
        this.chunkIndex = chunkIndex;
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
