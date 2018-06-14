package soupply.java338.serverbound;

import java.util.*;
import soupply.util.*;

class CreativeInventoryAction extends soupply.java338.Packet
{

    public short slot;
    public soupply.java338.type.Slot clickedItem;

    public CreativeInventoryAction()
    {
    }

    public CreativeInventoryAction(short slot, soupply.java338.type.Slot clickedItem)
    {
        this.slot = slot;
        this.clickedItem = clickedItem;
    }

}
