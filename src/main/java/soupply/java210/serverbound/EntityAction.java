package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class EntityAction extends soupply.java210.Packet
{

    // action
    public static final int START_SNEAKING = 0;
    public static final int STOP_SNEAKING = 1;
    public static final int LEAVE_BED = 2;
    public static final int START_SPRINTING = 3;
    public static final int STOP_SPRINTING = 4;
    public static final int START_HORSE_JUMP = 5;
    public static final int STOP_HORSE_JUMP = 6;
    public static final int OPEN_HORSE_INVENTORY = 7;
    public static final int START_ELYTRA_FLYING = 8;

    public int entityId;
    public int action;
    public int jumpBoost;

    public EntityAction()
    {
    }

    public EntityAction(int entityId, int action, int jumpBoost)
    {
        this.entityId = entityId;
        this.action = action;
        this.jumpBoost = jumpBoost;
    }

}
