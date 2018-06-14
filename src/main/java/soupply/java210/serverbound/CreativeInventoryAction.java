package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class CreativeInventoryAction extends soupply.java210.Packet
{

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

}
