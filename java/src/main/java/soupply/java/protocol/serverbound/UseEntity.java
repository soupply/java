package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class UseEntity extends soupply.java.Packet
{

    public static final int ID = 10;

    // type
    public static final int INTERACT = 0;
    public static final int ATTACK = 1;
    public static final int INTERACT_AT = 2;

    // hand
    public static final int MAIN_HAND = 0;
    public static final int OFF_HAND = 1;

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
