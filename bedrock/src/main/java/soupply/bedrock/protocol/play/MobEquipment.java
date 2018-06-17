package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class MobEquipment extends soupply.bedrock.Packet
{

    public static final int ID = 31;

    public long entityId;
    public soupply.bedrock.type.Slot item;
    public byte inventorySlot;
    public byte hotbarSlot;
    public byte unknown4;

    public MobEquipment()
    {
        this.item = new soupply.bedrock.type.Slot();
    }

    public MobEquipment(long entityId, soupply.bedrock.type.Slot item, byte inventorySlot, byte hotbarSlot, byte unknown4)
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
        item.encodeBody(_buffer);
        _buffer.writeByte(inventorySlot);
        _buffer.writeByte(hotbarSlot);
        _buffer.writeByte(unknown4);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        item.decodeBody(_buffer);
        inventorySlot = _buffer.readByte();
        hotbarSlot = _buffer.readByte();
        unknown4 = _buffer.readByte();
    }

    public static MobEquipment fromBuffer(byte[] buffer)
    {
        MobEquipment packet = new MobEquipment();
        packet.safeDecode(buffer);
        return packet;
    }

}
