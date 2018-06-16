package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityVelocity extends soupply.java335.Packet
{

    public static final int ID = 61;

    public int entityId;
    public ShortXYZ velocity;

    public EntityVelocity()
    {
        this.velocity = new ShortXYZ();
    }

    public EntityVelocity(int entityId, ShortXYZ velocity)
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
