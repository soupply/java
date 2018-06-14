package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class BossBar extends soupply.java340.Packet
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
