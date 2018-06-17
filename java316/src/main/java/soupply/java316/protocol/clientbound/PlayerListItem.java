package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class PlayerListItem extends soupply.java316.Packet
{

    public static final int ID = 45;

    public int action;

    public PlayerListItem()
    {
    }

    public PlayerListItem(int action)
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

    public static PlayerListItem fromBuffer(byte[] buffer)
    {
        PlayerListItem packet = new PlayerListItem();
        packet.safeDecode(buffer);
        return packet;
    }

}
