package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class CreativeInventoryAction extends soupply.java.Packet
{

    public static final int ID = 27;

    public short slot;
    public soupply.java.type.Slot clickedItem;

    public CreativeInventoryAction()
    {
        this.clickedItem = new soupply.java.type.Slot();
    }

    public CreativeInventoryAction(short slot, soupply.java.type.Slot clickedItem)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
