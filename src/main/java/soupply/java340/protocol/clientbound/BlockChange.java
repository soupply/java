package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class BlockChange extends soupply.java340.Packet
{

    public static final int ID = 11;

    public long position;
    public int block;

    public BlockChange()
    {
    }

    public BlockChange(long position, int block)
    {
        this.position = position;
        this.block = block;
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
