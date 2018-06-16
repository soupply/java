package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class MultiBlockChange extends soupply.java316.Packet
{

    public static final int ID = 16;

    public IntXZ chunk;
    public soupply.java316.type.BlockChange[] changes;

    public MultiBlockChange()
    {
        this.chunk = new IntXZ();
    }

    public MultiBlockChange(IntXZ chunk, soupply.java316.type.BlockChange[] changes)
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
