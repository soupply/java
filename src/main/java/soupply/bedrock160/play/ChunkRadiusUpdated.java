package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class ChunkRadiusUpdated extends soupply.bedrock160.Packet
{

    public int radius;

    public ChunkRadiusUpdated()
    {
    }

    public ChunkRadiusUpdated(int radius)
    {
        this.radius = radius;
    }

}
