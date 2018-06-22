package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class CreativeInventoryAction extends soupply.java335.Packet
{

    public static final int ID = 27;

    public short slot;
    public soupply.java335.type.Slot clickedItem;

    public CreativeInventoryAction()
    {
        this.clickedItem = new soupply.java335.type.Slot();
    }

    public CreativeInventoryAction(short slot, soupply.java335.type.Slot clickedItem)
    {
        this.slot = slot;
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
        _buffer.writeBigEndianShort(slot);
        clickedItem.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        slot = _buffer.readBigEndianShort();
        clickedItem.decodeBody(_buffer);
    }

    public static CreativeInventoryAction fromBuffer(byte[] buffer)
    {
        CreativeInventoryAction packet = new CreativeInventoryAction();
        packet.safeDecode(buffer);
        return packet;
    }

}
