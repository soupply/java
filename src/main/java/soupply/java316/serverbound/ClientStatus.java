package soupply.java316.serverbound;

import java.util.*;
import soupply.util.*;

class ClientStatus extends soupply.java316.Packet
{

    // action
    public static final int RESPAWN = 0;
    public static final int REQUEST_STATS = 1;
    public static final int OPEN_INVENTORY = 2;

    public int action;

    public ClientStatus()
    {
    }

    public ClientStatus(int action)
    {
        this.action = action;
    }

}
