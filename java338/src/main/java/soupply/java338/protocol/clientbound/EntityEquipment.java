package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityEquipment extends soupply.java338.Packet
{

    public static final int ID = 63;

    public int entityId;
    public int slot;
    public soupply.java338.type.Slot item;

    public EntityEquipment()
    {
        this.item = new soupply.java338.type.Slot();
    }

    public EntityEquipment(int entityId, int slot, soupply.java338.type.Slot item)
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(entityId);
        _buffer.writeVaruint(slot);
        item.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        slot = _buffer.readVaruint();
        item.decodeBody(_buffer);
    }

    public static EntityEquipment fromBuffer(byte[] buffer)
    {
        EntityEquipment packet = new EntityEquipment();
        packet.safeDecode(buffer);
        return packet;
    }

}
