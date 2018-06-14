package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class MultiBlockChange extends soupply.java316.Packet
{

    public Tuples.IntXZ chunk;
    public soupply.java316.type.BlockChange[] changes;

    public MultiBlockChange()
    {
    }

    public MultiBlockChange(Tuples.IntXZ chunk, soupply.java316.type.BlockChange[] changes)
    {
        this.chunk = chunk;
        this.changes = changes;
    }

}
