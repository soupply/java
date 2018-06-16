package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class SteerVehicle extends soupply.java.Packet
{

    public static final int ID = 22;

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
