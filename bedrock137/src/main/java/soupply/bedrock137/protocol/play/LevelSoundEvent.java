package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class LevelSoundEvent extends soupply.bedrock137.Packet
{

    public static final int ID = 24;

    // sound
    public static final byte ITEM_USE_ON = 0;
    public static final byte HIT = 1;
    public static final byte STEP = 2;
    public static final byte FLY = 3;
    public static final byte JUMP = 4;
    public static final byte BREAK = 5;
    public static final byte PLACE = 6;
    public static final byte HEAVY_STEP = 7;
    public static final byte GALLOP = 8;
    public static final byte FALL = 9;
    public static final byte AMBIENT = 10;
    public static final byte AMBIENT_BABY = 11;
    public static final byte AMBIENT_IN_WATER = 12;
    public static final byte BREATHE = 13;
    public static final byte DEATH = 14;
    public static final byte DEATH_IN_WATER = 15;
    public static final byte DEATH_TO_ZOMBIE = 16;
    public static final byte HURT = 17;
    public static final byte HURT_IN_WATER = 18;
    public static final byte MAD = 19;
    public static final byte BOOST = 20;
    public static final byte BOW = 21;
    public static final byte SQUISH_BIG = 22;
    public static final byte SQUISH_SMALL = 23;
    public static final byte FALL_BIG = 24;
    public static final byte FALL_SMALL = 25;
    public static final byte SPLASH = 26;
    public static final byte FIZZ = 27;
    public static final byte FLAP = 28;
    public static final byte SWIM = 29;
    public static final byte DRINK = 30;
    public static final byte EAT = 31;
    public static final byte TAKEOFF = 32;
    public static final byte SHAKE = 33;
    public static final byte PLOP = 34;
    public static final byte LAND = 35;
    public static final byte SADDLE = 36;
    public static final byte ARMOR = 37;
    public static final byte ADD_CHEST = 38;
    public static final byte THROW = 39;
    public static final byte ATTACK = 40;
    public static final byte ATTACK_NODAMAGE = 41;
    public static final byte WARN = 42;
    public static final byte SHEAR = 43;
    public static final byte MILK = 44;
    public static final byte THUNDER = 45;
    public static final byte EXPLODE = 46;
    public static final byte FIRE = 47;
    public static final byte IGNITE = 48;
    public static final byte FUSE = 49;
    public static final byte STARE = 50;
    public static final byte SPAWN = 51;
    public static final byte SHOOT = 52;
    public static final byte BREAK_BLOCK = 53;
    public static final byte LAUNCH = 54;
    public static final byte BLAST = 55;
    public static final byte LARGE_BLAST = 56;
    public static final byte TWINKLE = 57;
    public static final byte REMEDY = 58;
    public static final byte UNFECT = 59;
    public static final byte LEVELUP = 60;
    public static final byte BOW_HIT = 61;
    public static final byte BULLET_HIT = 62;
    public static final byte EXTINGUISH_FIRE = 63;
    public static final byte ITEM_FIZZ = 64;
    public static final byte CHEST_OPEN = 65;
    public static final byte CHEST_CLOSED = 66;
    public static final byte SHULKER_BOX_OPEN = 67;
    public static final byte SHULKER_BOX_CLOSE = 68;
    public static final byte POWER_ON = 69;
    public static final byte POWER_OFF = 70;
    public static final byte ATTACH = 71;
    public static final byte DETACH = 72;
    public static final byte DENY = 73;
    public static final byte TRIPOD = 74;
    public static final byte POP = 75;
    public static final byte DROP_SLOT = 76;
    public static final byte NOTE = 77;
    public static final byte THORNS = 78;
    public static final byte PISTON_IN = 79;
    public static final byte PISTON_OUT = 80;
    public static final byte PORTAL = 81;
    public static final byte WATER = 82;
    public static final byte LAVA_POP = 83;
    public static final byte LAVA = 84;
    public static final byte BURP = 85;
    public static final byte BUCKET_FILL_WATER = 86;
    public static final byte BUCKET_FILL_LAVA = 87;
    public static final byte BUCKET_EMPTY_WATER = 88;
    public static final byte BUCKET_EMPTY_LAVA = 89;
    public static final byte RECORD_13 = 90;
    public static final byte RECORD_CAT = 91;
    public static final byte RECORD_BLOCKS = 92;
    public static final byte RECORD_CHIRP = 93;
    public static final byte RECORD_FAR = 94;
    public static final byte RECORD_MALL = 95;
    public static final byte RECORD_MELLOHI = 96;
    public static final byte RECORD_STAL = 97;
    public static final byte RECORD_STRAD = 98;
    public static final byte RECORD_WARD = 99;
    public static final byte RECORD_11 = 100;
    public static final byte RECORD_WAIT = 101;
    public static final byte GUARDIAN_FLOP = 103;
    public static final byte ELDERGUARDIAN_CURSE = 104;
    public static final byte MOB_WARNING = 105;
    public static final byte MOB_WARNING_BABY = 106;
    public static final byte TELEPORT = 107;
    public static final byte SHULKER_OPEN = 108;
    public static final byte SHULKER_CLOSE = 109;
    public static final byte HAGGLE = 110;
    public static final byte HAGGLE_YES = 111;
    public static final byte HAGGLE_NO = 112;
    public static final byte HAGGLE_IDLE = 113;
    public static final byte CHORUS_GROW = 114;
    public static final byte CHORUS_DEATH = 115;
    public static final byte GLASS = 116;
    public static final byte CAST_SPELL = 117;
    public static final byte PREPARE_ATTACK = 118;
    public static final byte PREPARE_SUMMON = 119;
    public static final byte PREPARE_WOLOLO = 120;
    public static final byte FANG = 121;
    public static final byte CHARGE = 122;
    public static final byte CAMERA_TAKE_PICTURE = 123;
    public static final byte LEASHKNOT_PLACE = 124;
    public static final byte LEASHKNOT_BREAK = 125;
    public static final byte GROWL = 126;
    public static final byte WHINE = 127;
    public static final byte PANT = 128;
    public static final byte PURR = 129;
    public static final byte PURREOW = 130;
    public static final byte DEATH_MIN_VOLUME = 131;
    public static final byte DEATH_MID_VOLUME = 132;
    public static final byte INITIATE_BLAZE = 133;
    public static final byte INITIATE_CAVE_SPIDER = 134;
    public static final byte INITIATE_CREEPER = 135;
    public static final byte INITIATE_ELDER_GUARDIAN = 136;
    public static final byte INITIATE_ENDER_DRAGON = 137;
    public static final byte INITIATE_ENDERMAN = 138;
    public static final byte INITIATE_EVOCATION_ILLAGER = 140;
    public static final byte INITIATE_GHAST = 141;
    public static final byte INITIATE_HUSK = 142;
    public static final byte INITIATE_ILLUSION_ILLAGER = 143;
    public static final byte INITIATE_MAGMA_CUBE = 144;
    public static final byte INITIATE_POLAR_BEAR = 145;
    public static final byte INITIATE_SHULKER = 146;
    public static final byte INITIATE_SILVERFISH = 147;
    public static final byte INITIATE_SKELETON = 148;
    public static final byte INITIATE_SLIME = 149;
    public static final byte INITIATE_SPIDER = 150;
    public static final byte INITIATE_STRAY = 151;
    public static final byte INITIATE_VEX = 152;
    public static final byte INITIATE_VINDICATION_ILLAGER = 153;
    public static final byte INITIATE_WITCH = 154;
    public static final byte INITIATE_WITHER = 155;
    public static final byte INITIATE_WITHER_SKELETON = 156;
    public static final byte INITIATE_WOLF = 157;
    public static final byte INITIATE_ZOMBIE = 158;
    public static final byte INITIATE_ZOMBIE_PIGMAN = 159;
    public static final byte INITIATE_ZOMBIE_VILLAGER = 160;
    public static final byte DEFAULT = 161;
    public static final byte UNDEFINED = 162;

    public byte sound;
    public FloatXYZ position;
    public int volume;
    public int pitch;
    public boolean unknown4;
    public boolean disableRelativeVolume;

    public LevelSoundEvent()
    {
        this.position = new FloatXYZ();
    }

    public LevelSoundEvent(byte sound, FloatXYZ position, int volume, int pitch, boolean unknown4, boolean disableRelativeVolume)
    {
        this.sound = sound;
        this.position = position;
        this.volume = volume;
        this.pitch = pitch;
        this.unknown4 = unknown4;
        this.disableRelativeVolume = disableRelativeVolume;
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
