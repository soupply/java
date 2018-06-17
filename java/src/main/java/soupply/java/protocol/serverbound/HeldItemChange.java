package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class HeldItemChange extends soupply.java.Packet
{

    public static final int ID = 26;

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
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        slot = _buffer.readBigEndianShort();
    }

    public static HeldItemChange fromBuffer(byte[] buffer)
    {
        HeldItemChange packet = new HeldItemChange();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
