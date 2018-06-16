package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class DestroyEntities extends soupply.java315.Packet
{

    public static final int ID = 48;

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
