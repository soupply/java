package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class Entity extends soupply.java340.Packet
{

    public static final int ID = 37;

    public int entityId;

    public Entity()
    {
    }

    public Entity(int entityId)
    {
        this.entityId = entityId;
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
