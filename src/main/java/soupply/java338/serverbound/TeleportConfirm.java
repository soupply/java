package soupply.java338.serverbound;

import java.util.*;
import soupply.util.*;

class TeleportConfirm extends soupply.java338.Packet
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
