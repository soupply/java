package soupply.java338.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class Player extends soupply.java338.Packet
{

    public static final int ID = 12;

    public boolean onGround;

    public Player()
    {
    }

    public Player(boolean onGround)
    {
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
