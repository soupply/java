package soupply.java340.serverbound;

import java.util.*;
import soupply.util.*;

class Spectate extends soupply.java340.Packet
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
