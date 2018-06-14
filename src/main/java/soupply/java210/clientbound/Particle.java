package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class Particle extends soupply.java210.Packet
{

    // particle id
    public static final int EXPLODE = 0;
    public static final int LARGE_EXPLOSION = 1;
    public static final int HUGE_EXPLOSION = 2;
    public static final int FIREWORK_SPARK = 3;
    public static final int BUBBLE = 4;
    public static final int SPLASH = 5;
    public static final int WAKE = 6;
    public static final int SUSPENDED = 7;
    public static final int DEPTH_SUSPEND = 8;
    public static final int CRIT = 9;
    public static final int MAGIC_CRIT = 10;
    public static final int SMOKE = 11;
    public static final int LARGE_SMOKE = 12;
    public static final int SPELL = 13;
    public static final int INSTANT_SPELL = 14;
    public static final int MOB_SPELL = 15;
    public static final int MOB_SPELL_AMBIENT = 16;
    public static final int WITCH_MAGIC = 17;
    public static final int DRIP_WATER = 18;
    public static final int DRIP_LAVA = 19;
    public static final int ANGRY_VILLAGER = 20;
    public static final int HAPPY_VILLAGER = 21;
    public static final int TOWN_AURA = 22;
    public static final int NOTE = 23;
    public static final int PORTAL = 24;
    public static final int ENCHANTMENT_TABLE = 25;
    public static final int FLAME = 26;
    public static final int LAVA = 27;
    public static final int FOOTSTEP = 28;
    public static final int CLOUD = 29;
    public static final int RED_DUST = 30;
    public static final int SNOWBALL_POOF = 31;
    public static final int SNOW_SHOVEL = 32;
    public static final int SLIME = 33;
    public static final int HEART = 34;
    public static final int BARRIER = 35;
    public static final int ITEM_CRACK = 36;
    public static final int BLOCK_CRACK = 37;
    public static final int BLOCK_DUST = 38;
    public static final int DROPLET = 39;
    public static final int TAKE = 40;
    public static final int MOB_APPEARANCE = 41;
    public static final int DRAGON_BREATH = 42;
    public static final int ENDROD = 43;
    public static final int DAMAGE_INDICATOR = 44;
    public static final int SWEEP_ATTACK = 45;
    public static final int FALLING_DUST = 46;

    public int particleId;
    public boolean longDistance;
    public Tuples.FloatXYZ position;
    public Tuples.FloatXYZ offset;
    public float data;
    public int count;
    public int[] additionalData;

    public Particle()
    {
    }

    public Particle(int particleId, boolean longDistance, Tuples.FloatXYZ position, Tuples.FloatXYZ offset, float data, int count, int[] additionalData)
    {
        this.particleId = particleId;
        this.longDistance = longDistance;
        this.position = position;
        this.offset = offset;
        this.data = data;
        this.count = count;
        this.additionalData = additionalData;
    }

}
