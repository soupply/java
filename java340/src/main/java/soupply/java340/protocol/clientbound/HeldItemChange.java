package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class HeldItemChange extends soupply.java340.Packet
{

    public static final int ID = 58;

    public byte slot;

    public HeldItemChange()
    {
    }

    public HeldItemChange(byte slot)
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
        _buffer.writeBigEndianByte(slot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        slot = _buffer.readBigEndianByte();
    }

    public static HeldItemChange fromBuffer(byte[] buffer)
    {
        HeldItemChange packet = new HeldItemChange();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
