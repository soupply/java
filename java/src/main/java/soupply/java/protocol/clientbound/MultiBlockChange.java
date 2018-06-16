package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class MultiBlockChange extends soupply.java.Packet
{

    public static final int ID = 16;

    public Tuples.IntXZ chunk;
    public soupply.java.type.BlockChange[] changes;

    public MultiBlockChange()
    {
    }

    public MultiBlockChange(Tuples.IntXZ chunk, soupply.java.type.BlockChange[] changes)
    {
        this.chunk = chunk;
        this.changes = changes;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
