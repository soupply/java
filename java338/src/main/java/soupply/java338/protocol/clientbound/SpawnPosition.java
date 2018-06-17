package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnPosition extends soupply.java338.Packet
{

    public static final int ID = 70;

    public long position;

    public SpawnPosition()
    {
    }

    public SpawnPosition(long position)
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
