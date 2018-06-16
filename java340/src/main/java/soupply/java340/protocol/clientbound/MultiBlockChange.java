package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class MultiBlockChange extends soupply.java340.Packet
{

    public static final int ID = 16;

    public Tuples.IntXZ chunk;
    public soupply.java340.type.BlockChange[] changes;

    public MultiBlockChange()
    {
        this.chunk = new Tuples.IntXZ();
        this.changes = new soupply.java340.type.BlockChange[]();
    }

    public MultiBlockChange(Tuples.IntXZ chunk, soupply.java340.type.BlockChange[] changes)
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
