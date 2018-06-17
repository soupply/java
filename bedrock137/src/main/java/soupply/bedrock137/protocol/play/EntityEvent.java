package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class EntityEvent extends soupply.bedrock137.Packet
{

    public static final int ID = 27;

    // event id
    public static final byte HURT_ANIMATION = (byte)2;
    public static final byte DEATH_ANIMATION = (byte)3;
    public static final byte TAME_FAIL = (byte)6;
    public static final byte TAME_SUCCESS = (byte)7;
    public static final byte SHAKE_WET = (byte)8;
    public static final byte USE_ITEM = (byte)9;
    public static final byte EAT_GRASS_ANIMATION = (byte)10;
    public static final byte FISH_HOOK_BUBBLES = (byte)11;
    public static final byte FISH_HOOK_POSITION = (byte)12;
    public static final byte FISH_HOOK_HOOK = (byte)13;
    public static final byte FISH_HOOK_TEASE = (byte)14;
    public static final byte SQUID_INK_CLOUD = (byte)15;
    public static final byte AMBIENT_SOUND = (byte)16;
    public static final byte RESPAWN = (byte)17;
    public static final byte UNLEASH = (byte)63;

    public long entityId;
    public byte eventId;
    public int data;

    public EntityEvent()
    {
    }

    public EntityEvent(long entityId, byte eventId, int data)
    {
        this.entityId = entityId;
        this.eventId = eventId;
        this.data = data;
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
        _buffer.writeByte(eventId);
        _buffer.writeVarint(data);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        eventId = _buffer.readByte();
        data = _buffer.readVarint();
    }

    public static EntityEvent fromBuffer(byte[] buffer)
    {
        EntityEvent packet = new EntityEvent();
        packet.safeDecode(buffer);
        return packet;
    }

}
