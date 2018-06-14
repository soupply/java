package soupply.java338.serverbound;

import java.util.*;
import soupply.util.*;

class Spectate extends soupply.java338.Packet
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
