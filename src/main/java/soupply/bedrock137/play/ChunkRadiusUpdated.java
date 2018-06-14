package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class ChunkRadiusUpdated extends soupply.bedrock137.Packet
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
