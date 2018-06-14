package soupply.java335.serverbound;

import java.util.*;
import soupply.util.*;

class Player extends soupply.java335.Packet
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
