package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class EntityEvent extends soupply.bedrock137.Packet
{

    public static final int ID = 27;

    // event id
    public static final byte HURT_ANIMATION = 2;
    public static final byte DEATH_ANIMATION = 3;
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
    public static final byte AMBIENT_SOUND = 16;
    public static final byte RESPAWN = 17;
    public static final byte UNLEASH = 63;

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
