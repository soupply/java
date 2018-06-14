package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class EntityEquipment extends soupply.java316.Packet
{

    public int entityId;
    public int slot;
    public soupply.java316.type.Slot item;

    public EntityEquipment()
    {
    }

    public EntityEquipment(int entityId, int slot, soupply.java316.type.Slot item)
    {
        this.entityId = entityId;
        this.slot = slot;
        this.item = item;
    }

}
