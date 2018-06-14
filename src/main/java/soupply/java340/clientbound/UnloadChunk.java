package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class UnloadChunk extends soupply.java340.Packet
{

    public Tuples.IntXZ position;

    public UnloadChunk()
    {
    }

    public UnloadChunk(Tuples.IntXZ position)
    {
        this.position = position;
    }

}
