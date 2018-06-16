package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityRelativeMove extends soupply.java335.Packet
{

    public static final int ID = 38;

    public int entityId;
    public Tuples.ShortXYZ delta;
    public boolean onGround;

    public EntityRelativeMove()
    {
        this.delta = new Tuples.ShortXYZ();
    }

    public EntityRelativeMove(int entityId, Tuples.ShortXYZ delta, boolean onGround)
    {
        this.entityId = entityId;
        this.delta = delta;
        this.onGround = onGround;
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
