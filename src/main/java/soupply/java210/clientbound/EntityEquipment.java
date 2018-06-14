package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class EntityEquipment extends soupply.java210.Packet
{

    public int entityId;
    public int slot;
    public soupply.java210.type.Slot item;

    public EntityEquipment()
    {
    }

    public EntityEquipment(int entityId, int slot, soupply.java210.type.Slot item)
    {
        this.entityId = entityId;
        this.slot = slot;
        this.item = item;
    }

}
