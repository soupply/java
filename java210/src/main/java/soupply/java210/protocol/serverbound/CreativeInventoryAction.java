package soupply.java210.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class CreativeInventoryAction extends soupply.java210.Packet
{

    public static final int ID = 24;

    public short slot;
    public soupply.java210.type.Slot clickedItem;

    public CreativeInventoryAction()
    {
    }

    public CreativeInventoryAction(short slot, soupply.java210.type.Slot clickedItem)
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
