package soupply.java315.serverbound;

import java.util.*;
import soupply.util.*;

class TeleportConfirm extends soupply.java315.Packet
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
