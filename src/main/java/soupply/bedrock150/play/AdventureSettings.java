package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class AdventureSettings extends soupply.bedrock150.Packet
{

    // flags
    public static final int IMMUTABLE_WORLD = 1;
    public static final int PVP_DISABLED = 2;
    public static final int PVM_DISABLED = 4;
    public static final int MVP_DISBALED = 8;
    public static final int EVP_DISABLED = 16;
    public static final int AUTO_JUMP = 32;
    public static final int ALLOW_FLIGHT = 64;
    public static final int NO_CLIP = 128;
    public static final int FLYING = 512;
    public static final int MUTED = 1024;

    // permission level
    public static final int LEVEL_USER = 0;
    public static final int LEVEL_OPERATOR = 1;
    public static final int LEVEL_HOST = 2;
    public static final int LEVEL_AUTOMATION = 3;
    public static final int LEVEL_ADMIN = 4;

    // abilities
    public static final int BUILD_AND_MINE = 1;
    public static final int DOORS_AND_SWITCHES = 2;
    public static final int OPEN_CONTAINERS = 4;
    public static final int ATTACK_PLAYERS = 8;
    public static final int ATTACK_MOBS = 16;
    public static final int OP = 32;
    public static final int TELEPORT = 64;

    // player rank
    public static final int VISITOR = 0;
    public static final int MEMBER = 1;
    public static final int OPERATOR = 2;
    public static final int CUSTOM = 3;

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

}
