package soupply.java315.serverbound;

import java.util.*;
import soupply.util.*;

class Player extends soupply.java315.Packet
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
