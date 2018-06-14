package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class MultiBlockChange extends soupply.java315.Packet
{

    public Tuples.IntXZ chunk;
    public soupply.java315.type.BlockChange[] changes;

    public MultiBlockChange()
    {
    }

    public MultiBlockChange(Tuples.IntXZ chunk, soupply.java315.type.BlockChange[] changes)
    {
        this.chunk = chunk;
        this.changes = changes;
    }

}
