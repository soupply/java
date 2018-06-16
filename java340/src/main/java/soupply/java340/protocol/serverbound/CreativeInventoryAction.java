package soupply.java340.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class CreativeInventoryAction extends soupply.java340.Packet
{

    public static final int ID = 27;

    public short slot;
    public soupply.java340.type.Slot clickedItem;

    public CreativeInventoryAction()
    {
        this.clickedItem = new soupply.java340.type.Slot();
    }

    public CreativeInventoryAction(short slot, soupply.java340.type.Slot clickedItem)
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
