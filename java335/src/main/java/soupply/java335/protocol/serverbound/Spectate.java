package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class Spectate extends soupply.java335.Packet
{

    public static final int ID = 30;

    public UUID player;

    public Spectate()
    {
        this.player = new UUID(0, 0);
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
