package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class UnloadChunk extends soupply.java316.Packet
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
