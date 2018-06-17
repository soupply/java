package soupply.java316.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class ClickWindow extends soupply.java316.Packet
{

    public static final int ID = 7;

    public byte window;
    public short slot;
    public byte button;
    public short action;
    public int mode;
    public soupply.java316.type.Slot clickedItem;

    public ClickWindow()
    {
        this.clickedItem = new soupply.java316.type.Slot();
    }

    public ClickWindow(byte window, short slot, byte button, short action, int mode, soupply.java316.type.Slot clickedItem)
    {
        this.window = window;
        this.slot = slot;
        this.button = button;
        this.action = action;
        this.mode = mode;
        this.clickedItem = clickedItem;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianByte(window);
        _buffer.writeBigEndianShort(slot);
        _buffer.writeBigEndianByte(button);
        _buffer.writeBigEndianShort(action);
        _buffer.writeVaruint(mode);
        clickedItem.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readBigEndianByte();
        slot = _buffer.readBigEndianShort();
        button = _buffer.readBigEndianByte();
        action = _buffer.readBigEndianShort();
        mode = _buffer.readVaruint();
        clickedItem.decodeBody(_buffer);
    }

    public static ClickWindow fromBuffer(byte[] buffer)
    {
        ClickWindow packet = new ClickWindow();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
