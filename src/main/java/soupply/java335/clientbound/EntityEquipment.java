package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class EntityEquipment extends soupply.java335.Packet
{

    public int entityId;
    public int slot;
    public soupply.java335.type.Slot item;

    public EntityEquipment()
    {
    }

    public EntityEquipment(int entityId, int slot, soupply.java335.type.Slot item)
    {
        this.entityId = entityId;
        this.slot = slot;
        this.item = item;
    }

}
