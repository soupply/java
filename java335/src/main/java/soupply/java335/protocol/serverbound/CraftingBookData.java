package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class CraftingBookData extends soupply.java335.Packet
{

    public static final int ID = 23;

    public int type;

    public CraftingBookData()
    {
    }

    public CraftingBookData(int type)
    {
        this.type = type;
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
