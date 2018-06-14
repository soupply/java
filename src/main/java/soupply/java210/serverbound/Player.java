package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class Player extends soupply.java210.Packet
{

    public boolean onGround;

    public Player()
    {
    }

    public Player(boolean onGround)
    {
        this.onGround = onGround;
    }

}
