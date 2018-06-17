package soupply.java315.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class Spectate extends soupply.java315.Packet
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeUUID(player);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        player = _buffer.readUUID();
    }

    public static Spectate fromBuffer(byte[] buffer)
    {
        Spectate packet = new Spectate();
        packet.safeDecode(buffer);
        return packet;
    }

}
