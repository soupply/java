package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class UseBed extends soupply.java.Packet
{

    public static final int ID = 48;

    public int entityId;
    public long position;

    public UseBed()
    {
    }

    public UseBed(int entityId, long position)
    {
        this.entityId = entityId;
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
