package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class SteerBoat extends soupply.java335.Packet
{

    public static final int ID = 18;

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

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
