package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class PlayerPosition extends soupply.java335.Packet
{

    public static final int ID = 14;

    public Tuples.DoubleXYZ position;
    public boolean onGround;

    public PlayerPosition()
    {
        this.position = new Tuples.DoubleXYZ();
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
