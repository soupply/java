package soupply.java338.serverbound;

import java.util.*;
import soupply.util.*;

class Player extends soupply.java338.Packet
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
