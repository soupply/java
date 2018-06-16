package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class AdventureSettings extends soupply.bedrock201.Packet
{

    public static final int ID = 55;

    // flags
    public static final int IMMUTABLE_WORLD = (int)1;
    public static final int PVP_DISABLED = (int)2;
    public static final int PVM_DISABLED = (int)4;
    public static final int MVP_DISBALED = (int)8;
    public static final int EVP_DISABLED = (int)16;
    public static final int AUTO_JUMP = (int)32;
    public static final int ALLOW_FLIGHT = (int)64;
    public static final int NO_CLIP = (int)128;
    public static final int FLYING = (int)512;
    public static final int MUTED = (int)1024;

    // permission level
    public static final int LEVEL_USER = (int)0;
    public static final int LEVEL_OPERATOR = (int)1;
    public static final int LEVEL_HOST = (int)2;
    public static final int LEVEL_AUTOMATION = (int)3;
    public static final int LEVEL_ADMIN = (int)4;

    // abilities
    public static final int BUILD_AND_MINE = (int)1;
    public static final int DOORS_AND_SWITCHES = (int)2;
    public static final int OPEN_CONTAINERS = (int)4;
    public static final int ATTACK_PLAYERS = (int)8;
    public static final int ATTACK_MOBS = (int)16;
    public static final int OP = (int)32;
    public static final int TELEPORT = (int)64;

    // player rank
    public static final int VISITOR = (int)0;
    public static final int MEMBER = (int)1;
    public static final int OPERATOR = (int)2;
    public static final int CUSTOM = (int)3;

    public int flags;
    public int permissionLevel;
    public int abilities;
    public int playerRank;
    public int customPermissions;
    public long entityId;

    public AdventureSettings()
    {
    }

    public AdventureSettings(int flags, int permissionLevel, int abilities, int playerRank, int customPermissions, long entityId)
    {
        this.flags = flags;
        this.permissionLevel = permissionLevel;
        this.abilities = abilities;
        this.playerRank = playerRank;
        this.customPermissions = customPermissions;
        this.entityId = entityId;
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
