package soupply.java338.serverbound;

import java.util.*;
import soupply.util.*;

class ClientStatus extends soupply.java338.Packet
{

    // action
    public static final int RESPAWN = 0;
    public static final int REQUEST_STATS = 1;

    public int action;

    public ClientStatus()
    {
    }

    public ClientStatus(int action)
    {
        this.action = action;
    }

}
