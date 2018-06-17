package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SetSlot extends soupply.java210.Packet
{

    public static final int ID = 22;

    public byte window;
    public short slot;
    public soupply.java210.type.Slot item;

    public SetSlot()
    {
        this.item = new soupply.java210.type.Slot();
    }

    public SetSlot(byte window, short slot, soupply.java210.type.Slot item)
    {
        this.window = window;
        this.slot = slot;
        this.item = item;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(window);
        _buffer.writeBigEndianShort(slot);
        item.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readByte();
        slot = _buffer.readBigEndianShort();
        item.decodeBody(_buffer);
    }

    public static SetSlot fromBuffer(byte[] buffer)
    {
        SetSlot packet = new SetSlot();
        packet.safeDecode(buffer);
        return packet;
    }

}
