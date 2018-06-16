package soupply.java340.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class UseEntity extends soupply.java340.Packet
{

    public static final int ID = 10;

    // type
    public static final int INTERACT = (int)0;
    public static final int ATTACK = (int)1;
    public static final int INTERACT_AT = (int)2;

    // hand
    public static final int MAIN_HAND = (int)0;
    public static final int OFF_HAND = (int)1;

    public int target;
    public int type;
    public FloatXYZ targetPosition;
    public int hand;

    public UseEntity()
    {
        this.targetPosition = new FloatXYZ();
    }

    public UseEntity(int target, int type, FloatXYZ targetPosition, int hand)
    {
        this.target = target;
        this.type = type;
        this.targetPosition = targetPosition;
        this.hand = hand;
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
