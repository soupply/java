package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class StartGame extends soupply.bedrock282.Packet
{

    public static final int ID = 11;

    // gamemode
    public static final int SURVIVAL = (int)0;
    public static final int CREATIVE = (int)1;
    public static final int ADVENTURE = (int)2;

    // dimension
    public static final int OVERWORLD = (int)0;
    public static final int NETHER = (int)1;
    public static final int END = (int)2;

    // generator
    public static final int OLD = (int)0;
    public static final int INFINITE = (int)1;
    public static final int FLAT = (int)2;

    // difficulty
    public static final int PEACEFUL = (int)0;
    public static final int EASY = (int)1;
    public static final int NORMAL = (int)2;
    public static final int HARD = (int)3;

    // version
    public static final byte VANILLA = (byte)0;
    public static final byte EDUCATION = (byte)1;

    public long entityId;
    public long runtimeId;
    public int gamemode;
    public FloatXYZ position;
    public float yaw;
    public float pitch;
    public int seed;
    public int dimension = 0;
    public int generator = 1;
    public int worldGamemode;
    public int difficulty;
    public IntXYZ spawnPosition;
    public boolean loadedInCreative;
    public int time;
    public byte version;
    public boolean eduFeaturesEnabled;
    public float rainLevel;
    public float lightningLevel;
    public boolean multiplayerGame = true;
    public boolean broadcastToLan;
    public boolean broadcastToXbl;
    public boolean commandsEnabled;
    public boolean textureRequired;
    public soupply.bedrock282.type.Rule[] gameRules;
    public boolean hasBonusChestEnabled;
    public boolean hasStartWithMapEnabled;
    public boolean hasTrustPlayersEnabled;
    public int defaultPermissionLevel;
    public int xboxLiveBroadcastMode;
    public int serverChunkTickRadius;
    public boolean hasPlatformBroadcast;
    public int platformBroadcastMode;
    public boolean xboxLiveBroadcastIntent;
    public boolean hasLockedBehaviorPack;
    public boolean hasLockedResourcePack;
    public boolean isFromLockedWorldTemplate;
    public String levelId;
    public String worldName;
    public String premiumWorldTemplate;
    public boolean isTrial;
    public long currentTick;
    public int enchantmentSeed;
    public long[] runtimeIdTable;
    public String multiplayerCorrelationId;

    public StartGame()
    {
        this.position = new FloatXYZ();
        this.spawnPosition = new IntXYZ();
    }

    public StartGame(long entityId, long runtimeId, int gamemode, FloatXYZ position, float yaw, float pitch, int seed, int dimension, int generator, int worldGamemode, int difficulty, IntXYZ spawnPosition, boolean loadedInCreative, int time, byte version, boolean eduFeaturesEnabled, float rainLevel, float lightningLevel, boolean multiplayerGame, boolean broadcastToLan, boolean broadcastToXbl, boolean commandsEnabled, boolean textureRequired, soupply.bedrock282.type.Rule[] gameRules, boolean hasBonusChestEnabled, boolean hasStartWithMapEnabled, boolean hasTrustPlayersEnabled, int defaultPermissionLevel, int xboxLiveBroadcastMode, int serverChunkTickRadius, boolean hasPlatformBroadcast, int platformBroadcastMode, boolean xboxLiveBroadcastIntent, boolean hasLockedBehaviorPack, boolean hasLockedResourcePack, boolean isFromLockedWorldTemplate, String levelId, String worldName, String premiumWorldTemplate, boolean isTrial, long currentTick, int enchantmentSeed, long[] runtimeIdTable, String multiplayerCorrelationId)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.gamemode = gamemode;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.seed = seed;
        this.dimension = dimension;
        this.generator = generator;
        this.worldGamemode = worldGamemode;
        this.difficulty = difficulty;
        this.spawnPosition = spawnPosition;
        this.loadedInCreative = loadedInCreative;
        this.time = time;
        this.version = version;
        this.eduFeaturesEnabled = eduFeaturesEnabled;
        this.rainLevel = rainLevel;
        this.lightningLevel = lightningLevel;
        this.multiplayerGame = multiplayerGame;
        this.broadcastToLan = broadcastToLan;
        this.broadcastToXbl = broadcastToXbl;
        this.commandsEnabled = commandsEnabled;
        this.textureRequired = textureRequired;
        this.gameRules = gameRules;
        this.hasBonusChestEnabled = hasBonusChestEnabled;
        this.hasStartWithMapEnabled = hasStartWithMapEnabled;
        this.hasTrustPlayersEnabled = hasTrustPlayersEnabled;
        this.defaultPermissionLevel = defaultPermissionLevel;
        this.xboxLiveBroadcastMode = xboxLiveBroadcastMode;
        this.serverChunkTickRadius = serverChunkTickRadius;
        this.hasPlatformBroadcast = hasPlatformBroadcast;
        this.platformBroadcastMode = platformBroadcastMode;
        this.xboxLiveBroadcastIntent = xboxLiveBroadcastIntent;
        this.hasLockedBehaviorPack = hasLockedBehaviorPack;
        this.hasLockedResourcePack = hasLockedResourcePack;
        this.isFromLockedWorldTemplate = isFromLockedWorldTemplate;
        this.levelId = levelId;
        this.worldName = worldName;
        this.premiumWorldTemplate = premiumWorldTemplate;
        this.isTrial = isTrial;
        this.currentTick = currentTick;
        this.enchantmentSeed = enchantmentSeed;
        this.runtimeIdTable = runtimeIdTable;
        this.multiplayerCorrelationId = multiplayerCorrelationId;
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
        _buffer.writeVarulong(runtimeId);
        _buffer.writeVarint(gamemode);
        _buffer.writeLittleEndianFloat(position.x);
        _buffer.writeLittleEndianFloat(position.y);
        _buffer.writeLittleEndianFloat(position.z);
        _buffer.writeLittleEndianFloat(yaw);
        _buffer.writeLittleEndianFloat(pitch);
        _buffer.writeVarint(seed);
        _buffer.writeVarint(dimension);
        _buffer.writeVarint(generator);
        _buffer.writeVarint(worldGamemode);
        _buffer.writeVarint(difficulty);
        _buffer.writeVarint(spawnPosition.x);
        _buffer.writeVarint(spawnPosition.y);
        _buffer.writeVarint(spawnPosition.z);
        _buffer.writeBool(loadedInCreative);
        _buffer.writeVarint(time);
        _buffer.writeByte(version);
        _buffer.writeBool(eduFeaturesEnabled);
        _buffer.writeLittleEndianFloat(rainLevel);
        _buffer.writeLittleEndianFloat(lightningLevel);
        _buffer.writeBool(multiplayerGame);
        _buffer.writeBool(broadcastToLan);
        _buffer.writeBool(broadcastToXbl);
        _buffer.writeBool(commandsEnabled);
        _buffer.writeBool(textureRequired);
        _buffer.writeVaruint((int)gameRules.length);
        for(soupply.bedrock282.type.Rule zfzjbv:gameRules)
        {
            zfzjbv.encodeBody(_buffer);
        }
        _buffer.writeBool(hasBonusChestEnabled);
        _buffer.writeBool(hasStartWithMapEnabled);
        _buffer.writeBool(hasTrustPlayersEnabled);
        _buffer.writeVarint(defaultPermissionLevel);
        _buffer.writeVarint(xboxLiveBroadcastMode);
        _buffer.writeLittleEndianInt(serverChunkTickRadius);
        _buffer.writeBool(hasPlatformBroadcast);
        _buffer.writeVarint(platformBroadcastMode);
        _buffer.writeBool(xboxLiveBroadcastIntent);
        _buffer.writeBool(hasLockedBehaviorPack);
        _buffer.writeBool(hasLockedResourcePack);
        _buffer.writeBool(isFromLockedWorldTemplate);
        byte[] bvzxz = _buffer.convertString(levelId);
        _buffer.writeVaruint((int)bvzxz.length);
        _buffer.writeBytes(bvzxz);
        byte[] d9bry1 = _buffer.convertString(worldName);
        _buffer.writeVaruint((int)d9bry1.length);
        _buffer.writeBytes(d9bry1);
        byte[] cjblbdcx = _buffer.convertString(premiumWorldTemplate);
        _buffer.writeVaruint((int)cjblbdcx.length);
        _buffer.writeBytes(cjblbdcx);
        _buffer.writeBool(isTrial);
        _buffer.writeLittleEndianLong(currentTick);
        _buffer.writeVarint(enchantmentSeed);
        _buffer.writeVaruint((int)runtimeIdTable.length);
        for(long cvdlzlvf:runtimeIdTable)
        {
            _buffer.writeVarulong(cvdlzlvf);
        }
        byte[] bvdlbfzj = _buffer.convertString(multiplayerCorrelationId);
        _buffer.writeVaruint((int)bvdlbfzj.length);
        _buffer.writeBytes(bvdlbfzj);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVarlong();
        runtimeId = _buffer.readVarulong();
        gamemode = _buffer.readVarint();
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        yaw = _buffer.readLittleEndianFloat();
        pitch = _buffer.readLittleEndianFloat();
        seed = _buffer.readVarint();
        dimension = _buffer.readVarint();
        generator = _buffer.readVarint();
        worldGamemode = _buffer.readVarint();
        difficulty = _buffer.readVarint();
        spawnPosition.x = _buffer.readVarint();
        spawnPosition.y = _buffer.readVarint();
        spawnPosition.z = _buffer.readVarint();
        loadedInCreative = _buffer.readBool();
        time = _buffer.readVarint();
        version = _buffer.readByte();
        eduFeaturesEnabled = _buffer.readBool();
        rainLevel = _buffer.readLittleEndianFloat();
        lightningLevel = _buffer.readLittleEndianFloat();
        multiplayerGame = _buffer.readBool();
        broadcastToLan = _buffer.readBool();
        broadcastToXbl = _buffer.readBool();
        commandsEnabled = _buffer.readBool();
        textureRequired = _buffer.readBool();
        final int bdbvdxc = _buffer.readVaruint();
        gameRules = new soupply.bedrock282.type.Rule[bdbvdxc];
        for(int zfzjbv=0;zfzjbv<gameRules.length;zfzjbv++)
        {
            gameRules[zfzjbv].decodeBody(_buffer);
        }
        hasBonusChestEnabled = _buffer.readBool();
        hasStartWithMapEnabled = _buffer.readBool();
        hasTrustPlayersEnabled = _buffer.readBool();
        defaultPermissionLevel = _buffer.readVarint();
        xboxLiveBroadcastMode = _buffer.readVarint();
        serverChunkTickRadius = _buffer.readLittleEndianInt();
        hasPlatformBroadcast = _buffer.readBool();
        platformBroadcastMode = _buffer.readVarint();
        xboxLiveBroadcastIntent = _buffer.readBool();
        hasLockedBehaviorPack = _buffer.readBool();
        hasLockedResourcePack = _buffer.readBool();
        isFromLockedWorldTemplate = _buffer.readBool();
        final int bvbvzxz = _buffer.readVaruint();
        levelId = _buffer.readString(bvbvzxz);
        final int bvd9bry1 = _buffer.readVaruint();
        worldName = _buffer.readString(bvd9bry1);
        final int bvcjblbd = _buffer.readVaruint();
        premiumWorldTemplate = _buffer.readString(bvcjblbd);
        isTrial = _buffer.readBool();
        currentTick = _buffer.readLittleEndianLong();
        enchantmentSeed = _buffer.readVarint();
        final int bjbrbvzr = _buffer.readVaruint();
        runtimeIdTable = new long[bjbrbvzr];
        for(int cvdlzlvf=0;cvdlzlvf<runtimeIdTable.length;cvdlzlvf++)
        {
            runtimeIdTable[cvdlzlvf] = _buffer.readVarulong();
        }
        final int bvbvdlbf = _buffer.readVaruint();
        multiplayerCorrelationId = _buffer.readString(bvbvdlbf);
    }

    public static StartGame fromBuffer(byte[] buffer)
    {
        StartGame packet = new StartGame();
        packet.safeDecode(buffer);
        return packet;
    }

}
