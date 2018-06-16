package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class MultiBlockChange extends soupply.java338.Packet
{

    public static final int ID = 16;

    public IntXZ chunk;
    public soupply.java338.type.BlockChange[] changes;

    public MultiBlockChange()
    {
        this.chunk = new IntXZ();
    }

    public MultiBlockChange(IntXZ chunk, soupply.java338.type.BlockChange[] changes)
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
