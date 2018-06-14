package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class PlayerAction extends soupply.bedrock160.Packet
{

    // action
    public static final int START_BREAK = 0;
    public static final int ABORT_BREAK = 1;
    public static final int STOP_BREAK = 2;
    public static final int GET_UPDATED_BLOCK = 3;
    public static final int DROP_ITEM = 4;
    public static final int START_SLEEPING = 5;
    public static final int STOP_SLEEPING = 6;
    public static final int RESPAWN = 7;
    public static final int JUMP = 8;
    public static final int START_SPRINT = 9;
    public static final int STOP_SPRINT = 10;
    public static final int START_SNEAK = 11;
    public static final int STOP_SNEAK = 12;
    public static final int START_GLIDING = 15;
    public static final int STOP_GLIDING = 16;
    public static final int BUILD_DENIED = 17;
    public static final int CONTINUE_BREAK = 18;
    public static final int CHANGE_SKIN = 19;

    public long entityId;
    public int action;
    public soupply.bedrock160.type.BlockPosition position;
    public int face;

    public PlayerAction()
    {
    }

    public PlayerAction(long entityId, int action, soupply.bedrock160.type.BlockPosition position, int face)
    {
        this.entityId = entityId;
        this.action = action;
        this.position = position;
        this.face = face;
    }

}
