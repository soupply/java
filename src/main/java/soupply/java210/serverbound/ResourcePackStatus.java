package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class ResourcePackStatus extends soupply.java210.Packet
{

    // result
    public static final int LOADED = 0;
    public static final int DECLINED = 1;
    public static final int FAILED = 2;
    public static final int ACCEPTED = 3;

    public int result;

    public ResourcePackStatus()
    {
    }

    public ResourcePackStatus(int result)
    {
        this.result = result;
    }

}
