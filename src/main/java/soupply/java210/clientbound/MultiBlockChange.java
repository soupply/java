package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class MultiBlockChange extends soupply.java210.Packet
{

    public Tuples.IntXZ chunk;
    public soupply.java210.type.BlockChange[] changes;

    public MultiBlockChange()
    {
    }

    public MultiBlockChange(Tuples.IntXZ chunk, soupply.java210.type.BlockChange[] changes)
    {
        this.chunk = chunk;
        this.changes = changes;
    }

}
