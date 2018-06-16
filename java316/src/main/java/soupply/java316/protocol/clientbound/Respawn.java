package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Respawn extends soupply.java316.Packet
{

    public static final int ID = 51;

    // dimension
    public static final int NETHER = -1;
    public static final int OVERWORLD = 0;
    public static final int END = 1;

    // difficulty
    public static final byte PEACEFUL = 0;
    public static final byte EASY = 1;
    public static final byte NORMAL = 2;
    public static final byte HARD = 3;

    // gamemode
    public static final byte SURVIVAL = 0;
    public static final byte CREATIVE = 1;
    public static final byte ADVENTURE = 2;
    public static final byte SPECTATOR = 3;

    // level type
    public static final String INFINITY = "default";
    public static final String FLAT = "flat";
    public static final String AMPLIFIED = "amplified";
    public static final String LARGE_BIOMES = "largeBiomes";

    public int dimension;
    public byte difficulty;
    public byte gamemode;
    public String levelType;

    public Respawn()
    {
    }

    public Respawn(int dimension, byte difficulty, byte gamemode, String levelType)
    {
        this.dimension = dimension;
        this.difficulty = difficulty;
        this.gamemode = gamemode;
        this.levelType = levelType;
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
