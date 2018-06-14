package soupply.java340.serverbound;

import java.util.*;
import soupply.util.*;

class CreativeInventoryAction extends soupply.java340.Packet
{

    public short slot;
    public soupply.java340.type.Slot clickedItem;

    public CreativeInventoryAction()
    {
    }

    public CreativeInventoryAction(short slot, soupply.java340.type.Slot clickedItem)
    {
        this.slot = slot;
        this.clickedItem = clickedItem;
    }

}
