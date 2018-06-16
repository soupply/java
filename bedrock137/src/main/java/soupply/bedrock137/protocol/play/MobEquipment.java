package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class MobEquipment extends soupply.bedrock137.Packet
{

    public static final int ID = 31;

    public long entityId;
    public soupply.bedrock137.type.Slot item;
    public byte inventorySlot;
    public byte hotbarSlot;
    public byte unknown4;

    public MobEquipment()
    {
    }

    public MobEquipment(long entityId, soupply.bedrock137.type.Slot item, byte inventorySlot, byte hotbarSlot, byte unknown4)
    {
        this.entityId = entityId;
        this.item = item;
        this.inventorySlot = inventorySlot;
        this.hotbarSlot = hotbarSlot;
        this.unknown4 = unknown4;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
