package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class LevelSoundEvent extends soupply.bedrock.Packet
{

    public static final int ID = 24;

    // sound
    public static final byte ITEM_USE_ON = (byte)0;
    public static final byte HIT = (byte)1;
    public static final byte STEP = (byte)2;
    public static final byte FLY = (byte)3;
    public static final byte JUMP = (byte)4;
    public static final byte BREAK = (byte)5;
    public static final byte PLACE = (byte)6;
    public static final byte HEAVY_STEP = (byte)7;
    public static final byte GALLOP = (byte)8;
    public static final byte FALL = (byte)9;
    public static final byte AMBIENT = (byte)10;
    public static final byte AMBIENT_BABY = (byte)11;
    public static final byte AMBIENT_IN_WATER = (byte)12;
    public static final byte BREATHE = (byte)13;
    public static final byte DEATH = (byte)14;
    public static final byte DEATH_IN_WATER = (byte)15;
    public static final byte DEATH_TO_ZOMBIE = (byte)16;
    public static final byte HURT = (byte)17;
    public static final byte HURT_IN_WATER = (byte)18;
    public static final byte MAD = (byte)19;
    public static final byte BOOST = (byte)20;
    public static final byte BOW = (byte)21;
    public static final byte SQUISH_BIG = (byte)22;
    public static final byte SQUISH_SMALL = (byte)23;
    public static final byte FALL_BIG = (byte)24;
    public static final byte FALL_SMALL = (byte)25;
    public static final byte SPLASH = (byte)26;
    public static final byte FIZZ = (byte)27;
    public static final byte FLAP = (byte)28;
    public static final byte SWIM = (byte)29;
    public static final byte DRINK = (byte)30;
    public static final byte EAT = (byte)31;
    public static final byte TAKEOFF = (byte)32;
    public static final byte SHAKE = (byte)33;
    public static final byte PLOP = (byte)34;
    public static final byte LAND = (byte)35;
    public static final byte SADDLE = (byte)36;
    public static final byte ARMOR = (byte)37;
    public static final byte MOB_ARMOR_STAND_PLACE = (byte)38;
    public static final byte ADD_CHEST = (byte)39;
    public static final byte THROW = (byte)40;
    public static final byte ATTACK = (byte)41;
    public static final byte ATTACK_NODAMAGE = (byte)42;
    public static final byte ATTACK_STRONG = (byte)43;
    public static final byte WARN = (byte)44;
    public static final byte SHEAR = (byte)45;
    public static final byte MILK = (byte)46;
    public static final byte THUNDER = (byte)47;
    public static final byte EXPLODE = (byte)48;
    public static final byte FIRE = (byte)49;
    public static final byte IGNITE = (byte)50;
    public static final byte FUSE = (byte)51;
    public static final byte STARE = (byte)52;
    public static final byte SPAWN = (byte)53;
    public static final byte SHOOT = (byte)54;
    public static final byte BREAK_BLOCK = (byte)55;
    public static final byte LAUNCH = (byte)56;
    public static final byte BLAST = (byte)57;
    public static final byte LARGE_BLAST = (byte)58;
    public static final byte TWINKLE = (byte)59;
    public static final byte REMEDY = (byte)60;
    public static final byte UNFECT = (byte)61;
    public static final byte LEVELUP = (byte)62;
    public static final byte BOW_HIT = (byte)63;
    public static final byte BULLET_HIT = (byte)64;
    public static final byte EXTINGUISH_FIRE = (byte)65;
    public static final byte ITEM_FIZZ = (byte)66;
    public static final byte CHEST_OPEN = (byte)67;
    public static final byte CHEST_CLOSED = (byte)68;
    public static final byte SHULKERBOX_OPEN = (byte)69;
    public static final byte SHULKERBOX_CLOSED = (byte)70;
    public static final byte ENDERCHEST_OPEN = (byte)71;
    public static final byte ENDERCHEST_CLOSED = (byte)72;
    public static final byte POWER_ON = (byte)73;
    public static final byte POWER_OFF = (byte)74;
    public static final byte ATTACH = (byte)75;
    public static final byte DETACH = (byte)76;
    public static final byte DENY = (byte)77;
    public static final byte TRIPOD = (byte)78;
    public static final byte POP = (byte)79;
    public static final byte DROP_SLOT = (byte)80;
    public static final byte NOTE = (byte)81;
    public static final byte THORNS = (byte)82;
    public static final byte PISTON_IN = (byte)83;
    public static final byte PISTON_OUT = (byte)84;
    public static final byte PORTAL = (byte)85;
    public static final byte WATER = (byte)86;
    public static final byte LAVA_POP = (byte)87;
    public static final byte LAVA = (byte)88;
    public static final byte BURP = (byte)89;
    public static final byte BUCKET_FILL_WATER = (byte)90;
    public static final byte BUCKET_FILL_LAVA = (byte)91;
    public static final byte BUCKET_EMPTY_WATER = (byte)92;
    public static final byte BUCKET_EMPTY_LAVA = (byte)93;
    public static final byte ARMOR_EQUIP_CHAIN = (byte)94;
    public static final byte ARMOR_EQUIP_DIAMOND = (byte)95;
    public static final byte ARMOR_EQUIP_GENERIC = (byte)96;
    public static final byte ARMOR_EQUIP_GOLD = (byte)97;
    public static final byte ARMOR_EQUIP_IRON = (byte)98;
    public static final byte ARMOR_EQUIP_LEATHER = (byte)99;
    public static final byte ARMOR_EQUIP_ELYTRA = (byte)100;
    public static final byte RECORD_13 = (byte)101;
    public static final byte RECORD_CAT = (byte)102;
    public static final byte RECORD_BLOCKS = (byte)103;
    public static final byte RECORD_CHIRP = (byte)104;
    public static final byte RECORD_FAR = (byte)105;
    public static final byte RECORD_MALL = (byte)106;
    public static final byte RECORD_MELLOHI = (byte)107;
    public static final byte RECORD_STAL = (byte)108;
    public static final byte RECORD_STRAD = (byte)109;
    public static final byte RECORD_WARD = (byte)110;
    public static final byte RECORD_11 = (byte)111;
    public static final byte RECORD_WAIT = (byte)112;
    public static final byte STOP_RECORD = (byte)113;
    public static final byte FLOP = (byte)114;
    public static final byte ELDERGUARDIAN_CURSE = (byte)115;
    public static final byte MOB_WARNING = (byte)116;
    public static final byte MOB_WARNING_BABY = (byte)117;
    public static final byte TELEPORT = (byte)118;
    public static final byte SHULKER_OPEN = (byte)119;
    public static final byte SHULKER_CLOSE = (byte)120;
    public static final byte HAGGLE = (byte)121;
    public static final byte HAGGLE_YES = (byte)122;
    public static final byte HAGGLE_NO = (byte)123;
    public static final byte HAGGLE_IDLE = (byte)124;
    public static final byte CHORUSGROW = (byte)125;
    public static final byte CHORUSDEATH = (byte)126;
    public static final byte GLASS = (byte)127;
    public static final byte POTION_BREWED = (byte)128;
    public static final byte CAST_SPELL = (byte)129;
    public static final byte PREPARE_ATTACK = (byte)130;
    public static final byte PREPARE_SUMMON = (byte)131;
    public static final byte PREPARE_WOLOLO = (byte)132;
    public static final byte FANG = (byte)133;
    public static final byte CHARGE = (byte)134;
    public static final byte CAMERA_TAKE_PICTURE = (byte)135;
    public static final byte LEASHKNOT_PLACE = (byte)136;
    public static final byte LEASHKNOT_BREAK = (byte)137;
    public static final byte GROWL = (byte)138;
    public static final byte WHINE = (byte)139;
    public static final byte PANT = (byte)140;
    public static final byte PURR = (byte)141;
    public static final byte PURREOW = (byte)142;
    public static final byte DEATH_MIN_VOLUME = (byte)143;
    public static final byte DEATH_MID_VOLUME = (byte)144;
    public static final byte IMITATE_BLAZE = (byte)145;
    public static final byte IMITATE_CAVE_SPIDER = (byte)146;
    public static final byte IMITATE_CREEPER = (byte)147;
    public static final byte IMITATE_ELDER_GUARDIAN = (byte)148;
    public static final byte IMITATE_ENDER_DRAGON = (byte)149;
    public static final byte IMITATE_ENDERMAN = (byte)150;
    public static final byte IMITATE_EVOCATION_ILLAGER = (byte)152;
    public static final byte IMITATE_GHAST = (byte)153;
    public static final byte IMITATE_HUSK = (byte)154;
    public static final byte IMITATE_ILLUSION_ILLAGER = (byte)155;
    public static final byte IMITATE_MAGMA_CUBE = (byte)156;
    public static final byte IMITATE_POLAR_BEAR = (byte)157;
    public static final byte IMITATE_SHULKER = (byte)158;
    public static final byte IMITATE_SILVERFISH = (byte)159;
    public static final byte IMITATE_SKELETON = (byte)160;
    public static final byte IMITATE_SLIME = (byte)161;
    public static final byte IMITATE_SPIDER = (byte)162;
    public static final byte IMITATE_STRAY = (byte)163;
    public static final byte IMITATE_VEX = (byte)164;
    public static final byte IMITATE_VINDICATION_ILLAGER = (byte)165;
    public static final byte IMITATE_WITCH = (byte)166;
    public static final byte IMITATE_WITHER = (byte)167;
    public static final byte IMITATE_WITHER_SKELETON = (byte)168;
    public static final byte IMITATE_WOLF = (byte)169;
    public static final byte IMITATE_ZOMBIE = (byte)170;
    public static final byte IMITATE_ZOMBIE_PIGMAN = (byte)171;
    public static final byte IMITATE_ZOMBIE_VILLAGER = (byte)172;
    public static final byte BLOCK_END_PORTAL_FRAME_FILL = (byte)173;
    public static final byte BLOCK_END_PORTAL_SPAWN = (byte)174;
    public static final byte RANDOM_ANVIL_USE = (byte)175;
    public static final byte BOTTLE_DRAGONBREATH = (byte)176;
    public static final byte PORTAL_TRAVEL = (byte)177;
    public static final byte ITEM_TRIDENT_HIT = (byte)178;
    public static final byte ITEM_TRIDENT_RETURN = (byte)179;
    public static final byte ITEM_TRIDENT_RIPTIDE_1 = (byte)180;
    public static final byte ITEM_TRIDENT_RIPTIDE_2 = (byte)181;
    public static final byte ITEM_TRIDENT_RIPTIDE_3 = (byte)182;
    public static final byte ITEM_TRIDENT_THROW = (byte)183;
    public static final byte ITEM_TRIDENT_THUNDER = (byte)184;
    public static final byte ITEM_TRIDENT_HIT_GROUND = (byte)185;
    public static final byte DEFAULT = (byte)186;
    public static final byte ELEMCONSTRUCT_OPEN = (byte)188;
    public static final byte ICEBOMB_HIT = (byte)189;
    public static final byte BALLOONPOP = (byte)190;
    public static final byte LT_REACTION_ICEBOMB = (byte)191;
    public static final byte LT_REACTION_BLEACH = (byte)192;
    public static final byte LT_REACTION_EPASTE = (byte)193;
    public static final byte LT_REACTION_EPASTE2 = (byte)194;
    public static final byte LT_REACTION_FERTILIZER = (byte)199;
    public static final byte LT_REACTION_FIREBALL = (byte)200;
    public static final byte LT_REACTION_MGSALT = (byte)201;
    public static final byte LT_REACTION_MISCFIRE = (byte)202;
    public static final byte LT_REACTION_FIRE = (byte)203;
    public static final byte LT_REACTION_MISCEXPLOSION = (byte)204;
    public static final byte LT_REACTION_MISCMYSTICAL = (byte)205;
    public static final byte LT_REACTION_MISCMYSTICAL2 = (byte)206;
    public static final byte LT_REACTION_PRODUCT = (byte)207;
    public static final byte SPARKLER_USE = (byte)208;
    public static final byte GLOWSTICK_USE = (byte)209;
    public static final byte SPARKLER_ACTIVE = (byte)210;
    public static final byte CONVERT_TO_DROWNED = (byte)211;
    public static final byte BUCKET_FILL_FISH = (byte)212;
    public static final byte BUCKET_EMPTY_FISH = (byte)213;
    public static final byte UNDEFINED = (byte)214;

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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(sound);
        _buffer.writeLittleEndianFloat(position.x);
        _buffer.writeLittleEndianFloat(position.y);
        _buffer.writeLittleEndianFloat(position.z);
        _buffer.writeVaruint(volume);
        _buffer.writeVarint(pitch);
        _buffer.writeBool(unknown4);
        _buffer.writeBool(disableRelativeVolume);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        sound = _buffer.readByte();
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        volume = _buffer.readVaruint();
        pitch = _buffer.readVarint();
        unknown4 = _buffer.readBool();
        disableRelativeVolume = _buffer.readBool();
    }

    public static LevelSoundEvent fromBuffer(byte[] buffer)
    {
        LevelSoundEvent packet = new LevelSoundEvent();
        packet.safeDecode(buffer);
        return packet;
    }

}
