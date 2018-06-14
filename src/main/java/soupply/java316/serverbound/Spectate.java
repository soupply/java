package soupply.java316.serverbound;

import java.util.*;
import soupply.util.*;

class Spectate extends soupply.java316.Packet
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
