package soupply.java335.serverbound;

import java.util.*;
import soupply.util.*;

class CreativeInventoryAction extends soupply.java335.Packet
{

    public short slot;
    public soupply.java335.type.Slot clickedItem;

    public CreativeInventoryAction()
    {
    }

    public CreativeInventoryAction(short slot, soupply.java335.type.Slot clickedItem)
    {
        this.slot = slot;
        this.clickedItem = clickedItem;
    }

}
