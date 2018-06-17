package soupply.java316.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class Player extends soupply.java316.Packet
{

    public static final int ID = 15;

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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(onGround);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        onGround = _buffer.readBool();
    }

    public static Player fromBuffer(byte[] buffer)
    {
        Player packet = new Player();
        packet.safeDecode(buffer);
        return packet;
    }

}
