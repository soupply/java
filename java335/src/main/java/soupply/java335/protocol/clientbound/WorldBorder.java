package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class WorldBorder extends soupply.java335.Packet
{

    public static final int ID = 55;

    public int action;

    public WorldBorder()
    {
    }

    public WorldBorder(int action)
    {
        this.action = action;
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
