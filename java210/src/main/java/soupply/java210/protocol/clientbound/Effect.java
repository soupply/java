package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Effect extends soupply.java210.Packet
{

    public static final int ID = 33;

    // effect id
    public static final int DISPENSER_DISPENSE = (int)1000;
    public static final int DISPENSER_FAIL_DISPENSE = (int)1001;
    public static final int DISPENSER_SHOOT = (int)1002;
    public static final int ENDER_EYE_LAUNCH = (int)1003;
    public static final int FIREWORK_SHOT = (int)1004;
    public static final int IRON_DOOR_OPEN = (int)1005;
    public static final int WOODEN_DOOR_OPEN = (int)1006;
    public static final int WOODEN_TRAPDOOR_OPEN = (int)1007;
    public static final int FENCE_GATE_OPEN = (int)1008;
    public static final int FIRE_EXTINGUISH = (int)1009;
    public static final int PLAY_RECORD = (int)1010;
    public static final int IRON_DOOR_CLOSE = (int)1011;
    public static final int WOODEN_DOOR_CLOSE = (int)1012;
    public static final int WOODEN_TRAPDOOR_CLOSE = (int)1013;
    public static final int FENCE_GATE_CLOSE = (int)1014;
    public static final int GHAST_WARN = (int)1015;
    public static final int GHAST_SHOOT = (int)1016;
    public static final int ENDERDRAGON_SHOOT = (int)1017;
    public static final int BLAZE_SHOOT = (int)1018;
    public static final int ZOMBIE_ATTACK_WOOD_DOOR = (int)1019;
    public static final int ZOMBIE_ATTACK_IRON_DOOR = (int)1020;
    public static final int ZOMBIE_BREAK_WOOD_DOOR = (int)1021;
    public static final int WITHER_BREAK_BLOCK = (int)1022;
    public static final int WITHER_SPAWN = (int)1023;
    public static final int WITHER_SHOOT = (int)1024;
    public static final int BAT_TAKE_OFF = (int)1025;
    public static final int ZOMBIE_INFECT_VILLAGER = (int)1026;
    public static final int ZOMBIE_VILLAGER_CONVERT = (int)1027;
    public static final int ENDER_DRAGON_BREATH = (int)1028;
    public static final int ANVIL_BREAK = (int)1029;
    public static final int ANVIL_USE = (int)1030;
    public static final int ANVIL_LAND = (int)1031;
    public static final int PORTAL_TRAVEL = (int)1032;
    public static final int CHORUS_FLOWER_GROW = (int)1033;
    public static final int CHORUS_FLOWER_DIE = (int)1034;
    public static final int BREWING_STAND_BREW = (int)1035;
    public static final int IRON_TRAPDOOR_OPEN = (int)1036;
    public static final int IRON_TRAPDOOR_CLOSE = (int)1037;
    public static final int SPAWN_10_SMOKE_PARTICLES = (int)2000;
    public static final int BREAK_BREAK_PARTICLES_AND_SOUND = (int)2001;
    public static final int SPLASH_POTION_PARTICLES_AND_SOUND = (int)2002;
    public static final int ENDER_EYE_BREAK_PARTICLES_AND_SOUND = (int)2003;
    public static final int MOB_SPAWN_PARTICLES = (int)2004;
    public static final int BONEMEAL_PARTICLES = (int)2005;
    public static final int DRAGON_BREATH = (int)2006;
    public static final int END_GATEWAY_SPAWN = (int)3000;
    public static final int ENDERDRAGON_GROWL = (int)3001;

    public int effectId;
    public long position;
    public int data;
    public boolean disableVolume;

    public Effect()
    {
    }

    public Effect(int effectId, long position, int data, boolean disableVolume)
    {
        this.effectId = effectId;
        this.position = position;
        this.data = data;
        this.disableVolume = disableVolume;
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
