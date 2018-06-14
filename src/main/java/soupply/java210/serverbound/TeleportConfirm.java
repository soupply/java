package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class TeleportConfirm extends soupply.java210.Packet
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
