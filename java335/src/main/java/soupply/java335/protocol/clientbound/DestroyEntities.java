package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class DestroyEntities extends soupply.java335.Packet
{

    public static final int ID = 49;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
