package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class MultiBlockChange extends soupply.java335.Packet
{

    public Tuples.IntXZ chunk;
    public soupply.java335.type.BlockChange[] changes;

    public MultiBlockChange()
    {
    }

    public MultiBlockChange(Tuples.IntXZ chunk, soupply.java335.type.BlockChange[] changes)
    {
        this.chunk = chunk;
        this.changes = changes;
    }

}
