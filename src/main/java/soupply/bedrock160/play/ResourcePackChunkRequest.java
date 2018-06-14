package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class ResourcePackChunkRequest extends soupply.bedrock160.Packet
{

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

}
