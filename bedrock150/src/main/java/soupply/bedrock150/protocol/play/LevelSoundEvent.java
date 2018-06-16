package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class LevelSoundEvent extends soupply.bedrock150.Packet
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
    public static final byte ATTACK_STRONG = 42;
    public static final byte WARN = 43;
    public static final byte SHEAR = 44;
    public static final byte MILK = 45;
    public static final byte THUNDER = 46;
    public static final byte EXPLODE = 47;
    public static final byte FIRE = 48;
    public static final byte IGNITE = 49;
    public static final byte FUSE = 50;
    public static final byte STARE = 51;
    public static final byte SPAWN = 52;
    public static final byte SHOOT = 53;
    public static final byte BREAK_BLOCK = 54;
    public static final byte LAUNCH = 55;
    public static final byte BLAST = 56;
    public static final byte LARGE_BLAST = 57;
    public static final byte TWINKLE = 58;
    public static final byte REMEDY = 59;
    public static final byte UNFECT = 60;
    public static final byte LEVELUP = 61;
    public static final byte BOW_HIT = 62;
    public static final byte BULLET_HIT = 63;
    public static final byte EXTINGUISH_FIRE = 64;
    public static final byte ITEM_FIZZ = 65;
    public static final byte CHEST_OPEN = 66;
    public static final byte CHEST_CLOSED = 67;
    public static final byte SHULKER_BOX_OPEN = 68;
    public static final byte SHULKER_BOX_CLOSE = 69;
    public static final byte POWER_ON = 70;
    public static final byte POWER_OFF = 71;
    public static final byte ATTACH = 72;
    public static final byte DETACH = 73;
    public static final byte DENY = 74;
    public static final byte TRIPOD = 75;
    public static final byte POP = 76;
    public static final byte DROP_SLOT = 77;
    public static final byte NOTE = 78;
    public static final byte THORNS = 79;
    public static final byte PISTON_IN = 80;
    public static final byte PISTON_OUT = 81;
    public static final byte PORTAL = 82;
    public static final byte WATER = 83;
    public static final byte LAVA_POP = 84;
    public static final byte LAVA = 85;
    public static final byte BURP = 86;
    public static final byte BUCKET_FILL_WATER = 87;
    public static final byte BUCKET_FILL_LAVA = 88;
    public static final byte BUCKET_EMPTY_WATER = 89;
    public static final byte BUCKET_EMPTY_LAVA = 90;
    public static final byte RECORD_13 = 91;
    public static final byte RECORD_CAT = 92;
    public static final byte RECORD_BLOCKS = 93;
    public static final byte RECORD_CHIRP = 94;
    public static final byte RECORD_FAR = 95;
    public static final byte RECORD_MALL = 96;
    public static final byte RECORD_MELLOHI = 97;
    public static final byte RECORD_STAL = 98;
    public static final byte RECORD_STRAD = 99;
    public static final byte RECORD_WARD = 100;
    public static final byte RECORD_11 = 101;
    public static final byte RECORD_WAIT = 102;
    public static final byte GUARDIAN_FLOP = 104;
    public static final byte ELDERGUARDIAN_CURSE = 105;
    public static final byte MOB_WARNING = 106;
    public static final byte MOB_WARNING_BABY = 107;
    public static final byte TELEPORT = 108;
    public static final byte SHULKER_OPEN = 109;
    public static final byte SHULKER_CLOSE = 110;
    public static final byte HAGGLE = 111;
    public static final byte HAGGLE_YES = 112;
    public static final byte HAGGLE_NO = 113;
    public static final byte HAGGLE_IDLE = 114;
    public static final byte CHORUS_GROW = 115;
    public static final byte CHORUS_DEATH = 116;
    public static final byte GLASS = 117;
    public static final byte CAST_SPELL = 118;
    public static final byte PREPARE_ATTACK = 119;
    public static final byte PREPARE_SUMMON = 120;
    public static final byte PREPARE_WOLOLO = 121;
    public static final byte FANG = 122;
    public static final byte CHARGE = 123;
    public static final byte CAMERA_TAKE_PICTURE = 124;
    public static final byte LEASHKNOT_PLACE = 125;
    public static final byte LEASHKNOT_BREAK = 126;
    public static final byte GROWL = 127;
    public static final byte WHINE = 128;
    public static final byte PANT = 129;
    public static final byte PURR = 130;
    public static final byte PURREOW = 131;
    public static final byte DEATH_MIN_VOLUME = 132;
    public static final byte DEATH_MID_VOLUME = 133;
    public static final byte INITIATE_BLAZE = 134;
    public static final byte INITIATE_CAVE_SPIDER = 135;
    public static final byte INITIATE_CREEPER = 136;
    public static final byte INITIATE_ELDER_GUARDIAN = 137;
    public static final byte INITIATE_ENDER_DRAGON = 138;
    public static final byte INITIATE_ENDERMAN = 139;
    public static final byte INITIATE_EVOCATION_ILLAGER = 141;
    public static final byte INITIATE_GHAST = 142;
    public static final byte INITIATE_HUSK = 143;
    public static final byte INITIATE_ILLUSION_ILLAGER = 144;
    public static final byte INITIATE_MAGMA_CUBE = 145;
    public static final byte INITIATE_POLAR_BEAR = 146;
    public static final byte INITIATE_SHULKER = 147;
    public static final byte INITIATE_SILVERFISH = 148;
    public static final byte INITIATE_SKELETON = 149;
    public static final byte INITIATE_SLIME = 150;
    public static final byte INITIATE_SPIDER = 151;
    public static final byte INITIATE_STRAY = 152;
    public static final byte INITIATE_VEX = 153;
    public static final byte INITIATE_VINDICATION_ILLAGER = 154;
    public static final byte INITIATE_WITCH = 155;
    public static final byte INITIATE_WITHER = 156;
    public static final byte INITIATE_WITHER_SKELETON = 157;
    public static final byte INITIATE_WOLF = 158;
    public static final byte INITIATE_ZOMBIE = 159;
    public static final byte INITIATE_ZOMBIE_PIGMAN = 160;
    public static final byte INITIATE_ZOMBIE_VILLAGER = 161;
    public static final byte BLOCK_END_PORTAL_FRAME_FILL = 162;
    public static final byte BLOCK_END_PORTAL_SPAWN = 163;
    public static final byte RANDOM_ANVIL_USE = 164;
    public static final byte BOTTLE_DRAGONBREATH = 165;
    public static final byte DEFAULT = 166;
    public static final byte UNDEFINED = 167;

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
