package soupply.java316.serverbound;

import java.util.*;
import soupply.util.*;

class TeleportConfirm extends soupply.java316.Packet
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
