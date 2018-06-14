package soupply.java316.serverbound;

import java.util.*;
import soupply.util.*;

class CreativeInventoryAction extends soupply.java316.Packet
{

    public short slot;
    public soupply.java316.type.Slot clickedItem;

    public CreativeInventoryAction()
    {
    }

    public CreativeInventoryAction(short slot, soupply.java316.type.Slot clickedItem)
    {
        this.slot = slot;
        this.clickedItem = clickedItem;
    }

}
