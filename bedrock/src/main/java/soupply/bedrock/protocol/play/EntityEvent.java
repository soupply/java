package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class EntityEvent extends soupply.bedrock.Packet
{

    public static final int ID = 27;

    // event id
    public static final byte HURT_ANIMATION = (byte)2;
    public static final byte DEATH_ANIMATION = (byte)3;
    public static final byte ARM_SWING = (byte)4;
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
    public static final byte ZOMBIE_VILLAGER_CURE = (byte)16;
    public static final byte RESPAWN = (byte)18;
    public static final byte IRON_GOLEM_OFFER_FLOWER = (byte)19;
    public static final byte IRON_GOLEM_WITHDRAW_FLOWER = (byte)20;
    public static final byte LOVE_PARTICLES = (byte)21;
    public static final byte WITCH_SPELL_ANIMATION = (byte)24;
    public static final byte FIREWORK_PARTICLES = (byte)25;
    public static final byte SILVERFISH_SPAWN_ANIMATION = (byte)27;
    public static final byte WITCH_DRINK_POTION = (byte)29;
    public static final byte WITCH_THROWN_POTION = (byte)30;
    public static final byte MINECART_TNT_PRIME_FUSE = (byte)31;
    public static final byte PLAYER_ADD_XP_LEVELS = (byte)34;
    public static final byte ELDER_GUARDIAN_CURSE = (byte)35;
    public static final byte AGENT_ARM_SWING = (byte)36;
    public static final byte ENDER_DRAGON_DEATH = (byte)37;
    public static final byte DUST_PARTICLES = (byte)38;
    public static final byte EATING_ITEM = (byte)57;
    public static final byte BABY_ANIMAL_FEED = (byte)60;
    public static final byte DEATH_SMOKE_CLOUD = (byte)61;
    public static final byte COMPLETE_TRADE = (byte)62;
    public static final byte REMOVE_LEASH = (byte)63;
    public static final byte CONSUME_TOTEM = (byte)65;
    public static final byte ENTITY_SPAWN = (byte)67;
    public static final byte DRAGON_PUKE = (byte)68;
    public static final byte ITEM_ENTITY_MERGE = (byte)69;

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
    public void decodeBody(Buffer _buffer) throws DecodeException
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
