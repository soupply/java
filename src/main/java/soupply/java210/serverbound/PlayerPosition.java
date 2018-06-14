package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class PlayerPosition extends soupply.java210.Packet
{

    public Tuples.DoubleXYZ position;
    public boolean onGround;

    public PlayerPosition()
    {
    }

    public PlayerPosition(Tuples.DoubleXYZ position, boolean onGround)
    {
        this.position = position;
        this.onGround = onGround;
    }

}
