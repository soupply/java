package soupply.java335.serverbound;

import java.util.*;
import soupply.util.*;

class Spectate extends soupply.java335.Packet
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
