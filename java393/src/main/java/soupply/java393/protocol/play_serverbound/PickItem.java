package soupply.java393.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class PickItem extends soupply.java393.Packet
{

    public static final int ID = 21;

    public int slot;

    public PickItem()
    {
    }

    public PickItem(int slot)
    {
        this.slot = slot;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(slot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        slot = _buffer.readVaruint();
    }

    public static PickItem fromBuffer(byte[] buffer)
    {
        PickItem packet = new PickItem();
        packet.safeDecode(buffer);
        return packet;
    }

}
