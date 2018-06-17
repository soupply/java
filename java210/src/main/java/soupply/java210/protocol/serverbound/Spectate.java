package soupply.java210.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class Spectate extends soupply.java210.Packet
{

    public static final int ID = 27;

    public UUID player;

    public Spectate()
    {
        this.player = new UUID();
    }

    public Spectate(UUID player)
    {
        this.player = player;
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
