package soupply.java210.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class Player extends soupply.java210.Packet
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
    public void decodeBody(Buffer _buffer) throws DecodeException
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
