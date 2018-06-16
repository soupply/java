package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

class Interact extends soupply.bedrock160.Packet
{

    public static final int ID = 33;

    // action
    public static final byte LEAVE_VEHICLE = 3;
    public static final byte HOVER = 4;
    public static final byte OPEN_INVENTORY = 6;

    public byte action;
    public long target;
    public Tuples.FloatXYZ targetPosition;

    public Interact()
    {
    }

    public Interact(byte action, long target, Tuples.FloatXYZ targetPosition)
    {
        this.action = action;
        this.target = target;
        this.targetPosition = targetPosition;
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
