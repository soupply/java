package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class DestroyEntities extends soupply.java316.Packet
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
