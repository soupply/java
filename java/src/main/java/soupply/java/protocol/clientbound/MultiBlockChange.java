package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class MultiBlockChange extends soupply.java.Packet
{

    public static final int ID = 16;

    public IntXZ chunk;
    public soupply.java.type.BlockChange[] changes;

    public MultiBlockChange()
    {
        this.chunk = new IntXZ();
    }

    public MultiBlockChange(IntXZ chunk, soupply.java.type.BlockChange[] changes)
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
