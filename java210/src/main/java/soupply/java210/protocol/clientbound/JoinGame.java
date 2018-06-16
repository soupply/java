package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class JoinGame extends soupply.java210.Packet
{

    public static final int ID = 35;

    // gamemode
    public static final byte SURVIVAL = 0;
    public static final byte CREATIVE = 1;
    public static final byte ADVENTURE = 2;
    public static final byte SPECTATOR = 3;

    // dimension
    public static final int NETHER = -1;
    public static final int OVERWORLD = 0;
    public static final int END = 1;

    // difficulty
    public static final byte PEACEFUL = 0;
    public static final byte EASY = 1;
    public static final byte NORMAL = 2;
    public static final byte HARD = 3;

    // level type
    public static final String INFINITY = "default";
    public static final String FLAT = "flat";
    public static final String AMPLIFIED = "amplified";
    public static final String LARGE_BIOMES = "largeBiomes";

    public int entityId;
    public byte gamemode;
    public int dimension;
    public byte difficulty;
    public byte maxPlayers;
    public String levelType;
    public boolean reducedDebug;

    public JoinGame()
    {
    }

    public JoinGame(int entityId, byte gamemode, int dimension, byte difficulty, byte maxPlayers, String levelType, boolean reducedDebug)
    {
        this.entityId = entityId;
        this.gamemode = gamemode;
        this.dimension = dimension;
        this.difficulty = difficulty;
        this.maxPlayers = maxPlayers;
        this.levelType = levelType;
        this.reducedDebug = reducedDebug;
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
