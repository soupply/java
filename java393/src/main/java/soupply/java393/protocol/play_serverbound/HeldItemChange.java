package soupply.java393.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class HeldItemChange extends soupply.java393.Packet
{

    public static final int ID = 33;

    public short slot;

    public HeldItemChange()
    {
    }

    public HeldItemChange(short slot)
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
        _buffer.writeBigEndianShort(slot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        slot = _buffer.readBigEndianShort();
    }

    public static HeldItemChange fromBuffer(byte[] buffer)
    {
        HeldItemChange packet = new HeldItemChange();
        packet.safeDecode(buffer);
        return packet;
    }

}
