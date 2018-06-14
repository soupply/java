package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class EntityEquipment extends soupply.java340.Packet
{

    public int entityId;
    public int slot;
    public soupply.java340.type.Slot item;

    public EntityEquipment()
    {
    }

    public EntityEquipment(int entityId, int slot, soupply.java340.type.Slot item)
    {
        this.entityId = entityId;
        this.slot = slot;
        this.item = item;
    }

}
