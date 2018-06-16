package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class PlayerPosition extends soupply.java.Packet
{

    public static final int ID = 13;

    public Tuples.DoubleXYZ position;
    public boolean onGround;

    public PlayerPosition()
    {
    }

    public PlayerPosition(Tuples.DoubleXYZ position, boolean onGround)
    {
        this.position = position;
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
