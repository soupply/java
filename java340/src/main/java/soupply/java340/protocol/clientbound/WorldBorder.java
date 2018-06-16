package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class WorldBorder extends soupply.java340.Packet
{

    public static final int ID = 56;

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
    public void decodeBody(Buffer buffer)
    {
    }

}