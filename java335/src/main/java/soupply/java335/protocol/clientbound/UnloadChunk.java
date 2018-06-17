package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class UnloadChunk extends soupply.java335.Packet
{

    public static final int ID = 29;

    public IntXZ position;

    public UnloadChunk()
    {
        this.position = new IntXZ();
    }

    public UnloadChunk(IntXZ position)
    {
        this.position = position;
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
