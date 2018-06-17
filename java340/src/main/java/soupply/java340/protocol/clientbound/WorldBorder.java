package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class WorldBorder extends soupply.java340.Packet
{

    public static final int ID = 56;

    public int action;

    public WorldBorder()
    {
    }

    public WorldBorder(int action)
    {
        this.action = action;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(action);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        action = _buffer.readVaruint();
    }

    public static WorldBorder fromBuffer(byte[] buffer)
    {
        WorldBorder packet = new WorldBorder();
        packet.safeDecode(buffer);
        return packet;
    }

}
