package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class RequestChunkRadius extends soupply.bedrock137.Packet
{

    public int radius;

    public RequestChunkRadius()
    {
    }

    public RequestChunkRadius(int radius)
    {
        this.radius = radius;
    }

}
