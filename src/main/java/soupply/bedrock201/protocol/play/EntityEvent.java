package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

class EntityEvent extends soupply.bedrock201.Packet
{

    public static final int ID = 27;

    // event id
    public static final byte HURT_ANIMATION = 2;
    public static final byte DEATH_ANIMATION = 3;
    public static final byte ARM_SWING = 4;
    public static final byte TAME_FAIL = 6;
    public static final byte TAME_SUCCESS = 7;
    public static final byte SHAKE_WET = 8;
    public static final byte USE_ITEM = 9;
    public static final byte EAT_GRASS_ANIMATION = 10;
    public static final byte FISH_HOOK_BUBBLES = 11;
    public static final byte FISH_HOOK_POSITION = 12;
    public static final byte FISH_HOOK_HOOK = 13;
    public static final byte FISH_HOOK_TEASE = 14;
    public static final byte SQUID_INK_CLOUD = 15;
    public static final byte ZOMBIE_VILLAGER_CURE = 16;
    public static final byte RESPAWN = 18;
    public static final byte IRON_GOLEM_OFFER_FLOWER = 19;
    public static final byte IRON_GOLEM_WITHDRAW_FLOWER = 20;
    public static final byte LOVE_PARTICLES = 21;
    public static final byte WITCH_SPELL_ANIMATION = 24;
    public static final byte FIREWORK_PARTICLES = 25;
    public static final byte SILVERFISH_SPAWN_ANIMATION = 27;
    public static final byte WITCH_DRINK_POTION = 29;
    public static final byte WITCH_THROWN_POTION = 30;
    public static final byte MINECART_TNT_PRIME_FUSE = 31;
    public static final byte PLAYER_ADD_XP_LEVELS = 34;
    public static final byte ELDER_GUARDIAN_CURSE = 35;
    public static final byte AGENT_ARM_SWING = 36;
    public static final byte ENDER_DRAGON_DEATH = 37;
    public static final byte DUST_PARTICLES = 38;
    public static final byte EATING_ITEM = 57;
    public static final byte BABY_ANIMAL_FEED = 60;
    public static final byte DEATH_SMOKE_CLOUD = 61;
    public static final byte COMPLETE_TRADE = 62;
    public static final byte REMOVE_LEASH = 63;
    public static final byte CONSUME_TOTEM = 65;
    public static final byte ENTITY_SPAWN = 67;
    public static final byte DRAGON_PUKE = 68;
    public static final byte ITEM_ENTITY_MERGE = 69;

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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
