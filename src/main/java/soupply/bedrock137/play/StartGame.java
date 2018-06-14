package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class StartGame extends soupply.bedrock137.Packet
{

    // gamemode
    public static final int SURVIVAL = 0;
    public static final int CREATIVE = 1;
    public static final int ADVENTURE = 2;

    // dimension
    public static final int OVERWORLD = 0;
    public static final int NETHER = 1;
    public static final int END = 2;

    // generator
    public static final int OLD = 0;
    public static final int INFINITE = 1;
    public static final int FLAT = 2;

    // difficulty
    public static final int PEACEFUL = 0;
    public static final int EASY = 1;
    public static final int NORMAL = 2;
    public static final int HARD = 3;

    // version
    public static final byte VANILLA = 0;
    public static final byte EDUCATION = 1;

    public long entityId;
    public long runtimeId;
    public int gamemode;
    public Tuples.FloatXYZ position;
    public float yaw;
    public float pitch;
    public int seed;
    public int dimension = 0;
    public int generator = 1;
    public int worldGamemode;
    public int difficulty;
    public Tuples.IntXYZ spawnPosition;
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
    public soupply.bedrock137.type.Rule[] gameRules;
    public boolean bonusChestEnabled;
    public boolean startWithMapEnabled;
    public boolean trustPlayersEnabled;
    public int permissionLevel;
    public int unknown27;
    public String levelId;
    public String worldName;
    public String premiumWorldTemplate;
    public boolean unknown31;
    public long worldTicks;
    public int unknown33;

    public StartGame()
    {
    }

    public StartGame(long entityId, long runtimeId, int gamemode, Tuples.FloatXYZ position, float yaw, float pitch, int seed, int dimension, int generator, int worldGamemode, int difficulty, Tuples.IntXYZ spawnPosition, boolean loadedInCreative, int time, byte version, float rainLevel, float lightningLevel, boolean multiplayerGame, boolean broadcastToLan, boolean broadcastToXbl, boolean commandsEnabled, boolean textureRequired, soupply.bedrock137.type.Rule[] gameRules, boolean bonusChestEnabled, boolean startWithMapEnabled, boolean trustPlayersEnabled, int permissionLevel, int unknown27, String levelId, String worldName, String premiumWorldTemplate, boolean unknown31, long worldTicks, int unknown33)
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
        this.permissionLevel = permissionLevel;
        this.unknown27 = unknown27;
        this.levelId = levelId;
        this.worldName = worldName;
        this.premiumWorldTemplate = premiumWorldTemplate;
        this.unknown31 = unknown31;
        this.worldTicks = worldTicks;
        this.unknown33 = unknown33;
    }

}
