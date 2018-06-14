package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class PlayStatus extends soupply.bedrock160.Packet
{

    // status
    public static final int OK = 0;
    public static final int OUTDATED_CLIENT = 1;
    public static final int OUTDATED_SERVER = 2;
    public static final int SPAWNED = 3;
    public static final int INVALID_TENANT = 4;
    public static final int EDITION_MISMATCH_EDU_TO_VANILLA = 5;
    public static final int EDITION_MISMATCH_VANILLA_TO_EDU = 6;

    public int status;

    public PlayStatus()
    {
    }

    public PlayStatus(int status)
    {
        this.status = status;
    }

}
