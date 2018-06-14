package soupply.java315.serverbound;

import java.util.*;
import soupply.util.*;

class CreativeInventoryAction extends soupply.java315.Packet
{

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

}
