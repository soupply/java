package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class HeldItemChange extends soupply.java335.Packet
{

    public static final int ID = 57;

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
        _buffer.writeByte(slot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        slot = _buffer.readByte();
    }

    public static HeldItemChange fromBuffer(byte[] buffer)
    {
        HeldItemChange packet = new HeldItemChange();
        packet.safeDecode(buffer);
        return packet;
    }

}
