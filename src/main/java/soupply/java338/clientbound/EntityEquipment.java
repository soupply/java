package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class EntityEquipment extends soupply.java338.Packet
{

    public int entityId;
    public int slot;
    public soupply.java338.type.Slot item;

    public EntityEquipment()
    {
    }

    public EntityEquipment(int entityId, int slot, soupply.java338.type.Slot item)
    {
        this.entityId = entityId;
        this.slot = slot;
        this.item = item;
    }

}
