package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class CraftingBookData extends soupply.java335.Packet
{

    public static final int ID = 23;

    public int type;

    public CraftingBookData()
    {
    }

    public CraftingBookData(int type)
    {
        this.type = type;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(type);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        type = _buffer.readVaruint();
    }

    public static CraftingBookData fromBuffer(byte[] buffer)
    {
        CraftingBookData packet = new CraftingBookData();
        packet.safeDecode(buffer);
        return packet;
    }

}
