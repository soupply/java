package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class BossBar extends soupply.java315.Packet
{

    public UUID uuid;
    public int action;

    public BossBar()
    {
    }

    public BossBar(UUID uuid, int action)
    {
        this.uuid = uuid;
        this.action = action;
    }

}
