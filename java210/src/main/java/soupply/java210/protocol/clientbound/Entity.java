package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Entity extends soupply.java210.Packet
{

    public static final int ID = 40;

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
