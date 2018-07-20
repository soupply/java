package soupply.java393.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class SetSlot extends soupply.java393.Packet
{

    public static final int ID = 23;

    public byte window;
    public short slot;
    public soupply.java393.type.Slot item;

    public SetSlot()
    {
        this.item = new soupply.java393.type.Slot();
    }

    public SetSlot(byte window, short slot, soupply.java393.type.Slot item)
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
    public void decodeBody(Buffer _buffer) throws DecodeException
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
