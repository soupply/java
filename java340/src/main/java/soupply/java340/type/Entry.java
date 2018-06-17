package soupply.java340.type;

import java.util.*;
import soupply.util.*;

public class Entry extends Type
{

    public soupply.java340.type.Slot item;
    public byte craftingSlot;
    public byte playerSlot;

    public Entry()
    {
        this.item = new soupply.java340.type.Slot();
    }

    public Entry(soupply.java340.type.Slot item, byte craftingSlot, byte playerSlot)
    {
        this.item = item;
        this.craftingSlot = craftingSlot;
        this.playerSlot = playerSlot;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        item.encodeBody(_buffer);
        _buffer.writeBigEndianByte(craftingSlot);
        _buffer.writeBigEndianByte(playerSlot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        item.decodeBody(_buffer);
        craftingSlot = _buffer.readBigEndianByte();
        playerSlot = _buffer.readBigEndianByte();
    }

}
