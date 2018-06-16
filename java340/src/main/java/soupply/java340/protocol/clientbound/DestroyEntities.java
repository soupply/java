package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class DestroyEntities extends soupply.java340.Packet
{

    public static final int ID = 50;

    public int[] entityIds;

    public DestroyEntities()
    {
    }

    public DestroyEntities(int[] entityIds)
    {
        this.entityIds = entityIds;
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