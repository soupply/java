package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class InventoryTransaction extends soupply.bedrock160.Packet
{

    public static final int ID = 30;

    public int type;
    public soupply.bedrock160.type.InventoryAction[] actions;

    public InventoryTransaction()
    {
    }

    public InventoryTransaction(int type, soupply.bedrock160.type.InventoryAction[] actions)
    {
        this.type = type;
        this.actions = actions;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(type);
        _buffer.writeVaruint((int)actions.length);
        for(soupply.bedrock160.type.InventoryAction yna9c:actions)
        {
            yna9c.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        type = _buffer.readVaruint();
        final int bfdlbm = _buffer.readVaruint();
        actions = new soupply.bedrock160.type.InventoryAction[bfdlbm];
        for(int yna9c=0;yna9c<actions.length;yna9c++)
        {
            actions[yna9c].decodeBody(_buffer);
        }
    }

    public static InventoryTransaction fromBuffer(byte[] buffer)
    {
        InventoryTransaction packet = new InventoryTransaction();
        packet.safeDecode(buffer);
        return packet;
    }

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class Normal0 extends soupply.bedrock160.Packet
    {

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 0;
            encodeMainBody(_buffer);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
        }

    }

    public class Normal1 extends soupply.bedrock160.Packet
    {

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 1;
            encodeMainBody(_buffer);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
        }

    }

    public class UseItem extends soupply.bedrock160.Packet
    {

        // action type
        public static final int CLICK_BLOCK = (int)0;
        public static final int CLICK_AIR = (int)1;
        public static final int BREAK_BLOCK = (int)2;

        public int actionType;
        public soupply.bedrock160.type.BlockPosition blockPosition;
        public int face;
        public int hotbarSlot;
        public soupply.bedrock160.type.Slot item;
        public FloatXYZ playerPosition;
        public FloatXYZ clickPosition;

        public UseItem()
        {
            this.blockPosition = new soupply.bedrock160.type.BlockPosition();
            this.item = new soupply.bedrock160.type.Slot();
            this.playerPosition = new FloatXYZ();
            this.clickPosition = new FloatXYZ();
        }

        public UseItem(int actionType, soupply.bedrock160.type.BlockPosition blockPosition, int face, int hotbarSlot, soupply.bedrock160.type.Slot item, FloatXYZ playerPosition, FloatXYZ clickPosition)
        {
            this.actionType = actionType;
            this.blockPosition = blockPosition;
            this.face = face;
            this.hotbarSlot = hotbarSlot;
            this.item = item;
            this.playerPosition = playerPosition;
            this.clickPosition = clickPosition;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 2;
            encodeMainBody(_buffer);
            _buffer.writeVaruint(actionType);
            blockPosition.encodeBody(_buffer);
            _buffer.writeVarint(face);
            _buffer.writeVarint(hotbarSlot);
            item.encodeBody(_buffer);
            _buffer.writeLittleEndianFloat(playerPosition.x);
            _buffer.writeLittleEndianFloat(playerPosition.y);
            _buffer.writeLittleEndianFloat(playerPosition.z);
            _buffer.writeLittleEndianFloat(clickPosition.x);
            _buffer.writeLittleEndianFloat(clickPosition.y);
            _buffer.writeLittleEndianFloat(clickPosition.z);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            actionType = _buffer.readVaruint();
            blockPosition.decodeBody(_buffer);
            face = _buffer.readVarint();
            hotbarSlot = _buffer.readVarint();
            item.decodeBody(_buffer);
            playerPosition.x = _buffer.readLittleEndianFloat();
            playerPosition.y = _buffer.readLittleEndianFloat();
            playerPosition.z = _buffer.readLittleEndianFloat();
            clickPosition.x = _buffer.readLittleEndianFloat();
            clickPosition.y = _buffer.readLittleEndianFloat();
            clickPosition.z = _buffer.readLittleEndianFloat();
        }

    }

    public class UseItemOnEntity extends soupply.bedrock160.Packet
    {

        // action type
        public static final int INTERACT = (int)0;
        public static final int ATTACK = (int)1;

        public long entityId;
        public int actionType;
        public int hotbarSlot;
        public soupply.bedrock160.type.Slot item;
        public FloatXYZ unknown4;
        public FloatXYZ unknown5;

        public UseItemOnEntity()
        {
            this.item = new soupply.bedrock160.type.Slot();
            this.unknown4 = new FloatXYZ();
            this.unknown5 = new FloatXYZ();
        }

        public UseItemOnEntity(long entityId, int actionType, int hotbarSlot, soupply.bedrock160.type.Slot item, FloatXYZ unknown4, FloatXYZ unknown5)
        {
            this.entityId = entityId;
            this.actionType = actionType;
            this.hotbarSlot = hotbarSlot;
            this.item = item;
            this.unknown4 = unknown4;
            this.unknown5 = unknown5;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 3;
            encodeMainBody(_buffer);
            _buffer.writeVarlong(entityId);
            _buffer.writeVaruint(actionType);
            _buffer.writeVarint(hotbarSlot);
            item.encodeBody(_buffer);
            _buffer.writeLittleEndianFloat(unknown4.x);
            _buffer.writeLittleEndianFloat(unknown4.y);
            _buffer.writeLittleEndianFloat(unknown4.z);
            _buffer.writeLittleEndianFloat(unknown5.x);
            _buffer.writeLittleEndianFloat(unknown5.y);
            _buffer.writeLittleEndianFloat(unknown5.z);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            entityId = _buffer.readVarlong();
            actionType = _buffer.readVaruint();
            hotbarSlot = _buffer.readVarint();
            item.decodeBody(_buffer);
            unknown4.x = _buffer.readLittleEndianFloat();
            unknown4.y = _buffer.readLittleEndianFloat();
            unknown4.z = _buffer.readLittleEndianFloat();
            unknown5.x = _buffer.readLittleEndianFloat();
            unknown5.y = _buffer.readLittleEndianFloat();
            unknown5.z = _buffer.readLittleEndianFloat();
        }

    }

    public class ReleaseItem extends soupply.bedrock160.Packet
    {

        // action type
        public static final int SHOOT_BOW = (int)0;
        public static final int CONSUME = (int)1;

        public int actionType;
        public int hotbarSlot;
        public soupply.bedrock160.type.Slot item;
        public FloatXYZ headPosition;

        public ReleaseItem()
        {
            this.item = new soupply.bedrock160.type.Slot();
            this.headPosition = new FloatXYZ();
        }

        public ReleaseItem(int actionType, int hotbarSlot, soupply.bedrock160.type.Slot item, FloatXYZ headPosition)
        {
            this.actionType = actionType;
            this.hotbarSlot = hotbarSlot;
            this.item = item;
            this.headPosition = headPosition;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 4;
            encodeMainBody(_buffer);
            _buffer.writeVaruint(actionType);
            _buffer.writeVarint(hotbarSlot);
            item.encodeBody(_buffer);
            _buffer.writeLittleEndianFloat(headPosition.x);
            _buffer.writeLittleEndianFloat(headPosition.y);
            _buffer.writeLittleEndianFloat(headPosition.z);
        }

        @Override
        public void decodeBody(Buffer _buffer)
        {
            actionType = _buffer.readVaruint();
            hotbarSlot = _buffer.readVarint();
            item.decodeBody(_buffer);
            headPosition.x = _buffer.readLittleEndianFloat();
            headPosition.y = _buffer.readLittleEndianFloat();
            headPosition.z = _buffer.readLittleEndianFloat();
        }

    }

}
