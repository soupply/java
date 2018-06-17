package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class StartGame extends soupply.bedrock201.Packet
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
    public float rainLevel;
    public float lightningLevel;
    public boolean multiplayerGame = true;
    public boolean broadcastToLan;
    public boolean broadcastToXbl;
    public boolean commandsEnabled;
    public boolean textureRequired;
    public soupply.bedrock201.type.Rule[] gameRules;
    public boolean bonusChestEnabled;
    public boolean startWithMapEnabled;
    public boolean trustPlayersEnabled;
    public int defaultPermissionLevel;
    public int xboxLiveBroadcastMode;
    public int serverChunkTickRadius;
    public String levelId;
    public String worldName;
    public String premiumWorldTemplate;
    public boolean unknown32;
    public long worldTicks;
    public int enchantmentSeed;

    public StartGame()
    {
        this.position = new FloatXYZ();
        this.spawnPosition = new IntXYZ();
    }

    public StartGame(long entityId, long runtimeId, int gamemode, FloatXYZ position, float yaw, float pitch, int seed, int dimension, int generator, int worldGamemode, int difficulty, IntXYZ spawnPosition, boolean loadedInCreative, int time, byte version, float rainLevel, float lightningLevel, boolean multiplayerGame, boolean broadcastToLan, boolean broadcastToXbl, boolean commandsEnabled, boolean textureRequired, soupply.bedrock201.type.Rule[] gameRules, boolean bonusChestEnabled, boolean startWithMapEnabled, boolean trustPlayersEnabled, int defaultPermissionLevel, int xboxLiveBroadcastMode, int serverChunkTickRadius, String levelId, String worldName, String premiumWorldTemplate, boolean unknown32, long worldTicks, int enchantmentSeed)
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
        this.rainLevel = rainLevel;
        this.lightningLevel = lightningLevel;
        this.multiplayerGame = multiplayerGame;
        this.broadcastToLan = broadcastToLan;
        this.broadcastToXbl = broadcastToXbl;
        this.commandsEnabled = commandsEnabled;
        this.textureRequired = textureRequired;
        this.gameRules = gameRules;
        this.bonusChestEnabled = bonusChestEnabled;
        this.startWithMapEnabled = startWithMapEnabled;
        this.trustPlayersEnabled = trustPlayersEnabled;
        this.defaultPermissionLevel = defaultPermissionLevel;
        this.xboxLiveBroadcastMode = xboxLiveBroadcastMode;
        this.serverChunkTickRadius = serverChunkTickRadius;
        this.levelId = levelId;
        this.worldName = worldName;
        this.premiumWorldTemplate = premiumWorldTemplate;
        this.unknown32 = unknown32;
        this.worldTicks = worldTicks;
        this.enchantmentSeed = enchantmentSeed;
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
