package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class MultiBlockChange extends soupply.java340.Packet
{

    public Tuples.IntXZ chunk;
    public soupply.java340.type.BlockChange[] changes;

    public MultiBlockChange()
    {
    }

    public MultiBlockChange(Tuples.IntXZ chunk, soupply.java340.type.BlockChange[] changes)
    {
        this.chunk = chunk;
        this.changes = changes;
    }

}
