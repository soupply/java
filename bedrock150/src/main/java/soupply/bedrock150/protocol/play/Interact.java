package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class Interact extends soupply.bedrock150.Packet
{

    public static final int ID = 33;

    // action
    public static final byte LEAVE_VEHICLE = (byte)3;
    public static final byte HOVER = (byte)4;
    public static final byte OPEN_INVENTORY = (byte)6;

    public byte action;
    public long target;
    public FloatXYZ targetPosition;

    public Interact()
    {
        this.targetPosition = new FloatXYZ();
    }

    public Interact(byte action, long target, FloatXYZ targetPosition)
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
