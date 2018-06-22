package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class Entry extends Type
{

    public soupply.java.type.Slot item;
    public byte craftingSlot;
    public byte playerSlot;

    public Entry()
    {
        this.item = new soupply.java.type.Slot();
    }

    public Entry(soupply.java.type.Slot item, byte craftingSlot, byte playerSlot)
    {
        this.item = item;
        this.craftingSlot = craftingSlot;
        this.playerSlot = playerSlot;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        item.encodeBody(_buffer);
        _buffer.writeByte(craftingSlot);
        _buffer.writeByte(playerSlot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        item.decodeBody(_buffer);
        craftingSlot = _buffer.readByte();
        playerSlot = _buffer.readByte();
    }

}
