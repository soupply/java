package soupply.java316.serverbound;

import java.util.*;
import soupply.util.*;

class SteerVehicle extends soupply.java316.Packet
{

    // flags
    public static final byte JUMP = 1;
    public static final byte UNMOUNT = 2;

    public float sideways;
    public float forward;
    public byte flags;

    public SteerVehicle()
    {
    }

    public SteerVehicle(float sideways, float forward, byte flags)
    {
        this.sideways = sideways;
        this.forward = forward;
        this.flags = flags;
    }

}
