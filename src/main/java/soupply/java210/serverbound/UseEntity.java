package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class UseEntity extends soupply.java210.Packet
{

    // type
    public static final int INTERACT = 0;
    public static final int ATTACK = 1;
    public static final int INTERACT_AT = 2;

    // hand
    public static final int MAIN_HAND = 0;
    public static final int OFF_HAND = 1;

    public int target;
    public int type;
    public Tuples.FloatXYZ targetPosition;
    public int hand;

    public UseEntity()
    {
    }

    public UseEntity(int target, int type, Tuples.FloatXYZ targetPosition, int hand)
    {
        this.target = target;
        this.type = type;
        this.targetPosition = targetPosition;
        this.hand = hand;
    }

}
