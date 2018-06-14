package soupply.java315.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class CreativeInventoryAction extends soupply.java315.Packet
{

    public static final int ID = 24;

    public short slot;
    public soupply.java315.type.Slot clickedItem;

    public CreativeInventoryAction()
    {
    }

    public CreativeInventoryAction(short slot, soupply.java315.type.Slot clickedItem)
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
