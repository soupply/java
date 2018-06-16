package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class SteerVehicle extends soupply.java335.Packet
{

    public static final int ID = 22;

    // flags
    public static final byte JUMP = (byte)1;
    public static final byte UNMOUNT = (byte)2;

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
