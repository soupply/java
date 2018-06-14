package soupply.java335.serverbound;

import java.util.*;
import soupply.util.*;

class SteerBoat extends soupply.java335.Packet
{

    public boolean rightPaddleTurning;
    public boolean leftPaddleTurning;

    public SteerBoat()
    {
    }

    public SteerBoat(boolean rightPaddleTurning, boolean leftPaddleTurning)
    {
        this.rightPaddleTurning = rightPaddleTurning;
        this.leftPaddleTurning = leftPaddleTurning;
    }

}
