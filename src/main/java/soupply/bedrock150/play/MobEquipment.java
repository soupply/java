package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class MobEquipment extends soupply.bedrock150.Packet
{

    public long entityId;
    public soupply.bedrock150.type.Slot item;
    public byte inventorySlot;
    public byte hotbarSlot;
    public byte unknown4;

    public MobEquipment()
    {
    }

    public MobEquipment(long entityId, soupply.bedrock150.type.Slot item, byte inventorySlot, byte hotbarSlot, byte unknown4)
    {
        this.entityId = entityId;
        this.item = item;
        this.inventorySlot = inventorySlot;
        this.hotbarSlot = hotbarSlot;
        this.unknown4 = unknown4;
    }

}
