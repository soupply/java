package soupply.java210.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class EntityAction extends soupply.java210.Packet
{

    public static final int ID = 20;

    // action
    public static final int START_SNEAKING = (int)0;
    public static final int STOP_SNEAKING = (int)1;
    public static final int LEAVE_BED = (int)2;
    public static final int START_SPRINTING = (int)3;
    public static final int STOP_SPRINTING = (int)4;
    public static final int START_HORSE_JUMP = (int)5;
    public static final int STOP_HORSE_JUMP = (int)6;
    public static final int OPEN_HORSE_INVENTORY = (int)7;
    public static final int START_ELYTRA_FLYING = (int)8;

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
