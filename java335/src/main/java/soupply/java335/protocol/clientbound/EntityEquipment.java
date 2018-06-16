package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityEquipment extends soupply.java335.Packet
{

    public static final int ID = 62;

    public int entityId;
    public int slot;
    public soupply.java335.type.Slot item;

    public EntityEquipment()
    {
        this.item = new soupply.java335.type.Slot();
    }

    public EntityEquipment(int entityId, int slot, soupply.java335.type.Slot item)
    {
        this.entityId = entityId;
        this.slot = slot;
        this.item = item;
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
