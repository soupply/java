package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityVelocity extends soupply.java316.Packet
{

    public static final int ID = 59;

    public int entityId;
    public Tuples.ShortXYZ velocity;

    public EntityVelocity()
    {
    }

    public EntityVelocity(int entityId, Tuples.ShortXYZ velocity)
    {
        this.entityId = entityId;
        this.velocity = velocity;
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
