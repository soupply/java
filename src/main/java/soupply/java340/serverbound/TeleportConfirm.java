package soupply.java340.serverbound;

import java.util.*;
import soupply.util.*;

class TeleportConfirm extends soupply.java340.Packet
{

    public int teleportId;

    public TeleportConfirm()
    {
    }

    public TeleportConfirm(int teleportId)
    {
        this.teleportId = teleportId;
    }

}
