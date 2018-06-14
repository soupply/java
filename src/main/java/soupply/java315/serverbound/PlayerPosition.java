package soupply.java315.serverbound;

import java.util.*;
import soupply.util.*;

class PlayerPosition extends soupply.java315.Packet
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
