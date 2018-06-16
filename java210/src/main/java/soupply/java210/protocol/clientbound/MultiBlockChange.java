package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class MultiBlockChange extends soupply.java210.Packet
{

    public static final int ID = 16;

    public IntXZ chunk;
    public soupply.java210.type.BlockChange[] changes;

    public MultiBlockChange()
    {
        this.chunk = new IntXZ();
        this.changes = new soupply.java210.type.BlockChange[]();
    }

    public MultiBlockChange(IntXZ chunk, soupply.java210.type.BlockChange[] changes)
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