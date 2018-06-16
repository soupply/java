package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityRelativeMove extends soupply.java.Packet
{

    public static final int ID = 38;

    public int entityId;
    public ShortXYZ delta;
    public boolean onGround;

    public EntityRelativeMove()
    {
        this.delta = new ShortXYZ();
    }

    public EntityRelativeMove(int entityId, ShortXYZ delta, boolean onGround)
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
