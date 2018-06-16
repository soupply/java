package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityEquipment extends soupply.java340.Packet
{

    public static final int ID = 63;

    public int entityId;
    public int slot;
    public soupply.java340.type.Slot item;

    public EntityEquipment()
    {
        this.item = new soupply.java340.type.Slot();
    }

    public EntityEquipment(int entityId, int slot, soupply.java340.type.Slot item)
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
