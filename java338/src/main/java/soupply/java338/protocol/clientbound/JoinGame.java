package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class JoinGame extends soupply.java338.Packet
{

    public static final int ID = 35;

    // gamemode
    public static final byte SURVIVAL = (byte)0;
    public static final byte CREATIVE = (byte)1;
    public static final byte ADVENTURE = (byte)2;
    public static final byte SPECTATOR = (byte)3;

    // dimension
    public static final int NETHER = (int)-1;
    public static final int OVERWORLD = (int)0;
    public static final int END = (int)1;

    // difficulty
    public static final byte PEACEFUL = (byte)0;
    public static final byte EASY = (byte)1;
    public static final byte NORMAL = (byte)2;
    public static final byte HARD = (byte)3;

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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianInt(entityId);
        _buffer.writeBigEndianByte(gamemode);
        _buffer.writeBigEndianInt(dimension);
        _buffer.writeBigEndianByte(difficulty);
        _buffer.writeBigEndianByte(maxPlayers);
        byte[] bvzxeb = _buffer.convertString(levelType);
        _buffer.writeVaruint((int)bvzxeb.length);
        _buffer.writeBytes(bvzxeb);
        _buffer.writeBool(reducedDebug);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readBigEndianInt();
        gamemode = _buffer.readBigEndianByte();
        dimension = _buffer.readBigEndianInt();
        difficulty = _buffer.readBigEndianByte();
        maxPlayers = _buffer.readBigEndianByte();
        final int bvbvzxeb = _buffer.readVaruint();
        levelType = _buffer.readString(bvbvzxeb);
        reducedDebug = _buffer.readBool();
    }

    public static JoinGame fromBuffer(byte[] buffer)
    {
        JoinGame packet = new JoinGame();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
