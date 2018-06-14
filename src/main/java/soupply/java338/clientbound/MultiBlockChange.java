package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class MultiBlockChange extends soupply.java338.Packet
{

    public Tuples.IntXZ chunk;
    public soupply.java338.type.BlockChange[] changes;

    public MultiBlockChange()
    {
    }

    public MultiBlockChange(Tuples.IntXZ chunk, soupply.java338.type.BlockChange[] changes)
    {
        this.chunk = chunk;
        this.changes = changes;
    }

}
