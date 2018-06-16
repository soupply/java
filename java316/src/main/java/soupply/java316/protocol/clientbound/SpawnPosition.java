package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnPosition extends soupply.java316.Packet
{

    public static final int ID = 67;

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
    public void decodeBody(Buffer buffer)
    {
    }

}
