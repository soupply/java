package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class Spectate extends soupply.java210.Packet
{

    public UUID player;

    public Spectate()
    {
    }

    public Spectate(UUID player)
    {
        this.player = player;
    }

}
