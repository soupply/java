package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class PlayerAction extends soupply.bedrock150.Packet
{

    public static final int ID = 36;

    // action
    public static final int START_BREAK = (int)0;
    public static final int ABORT_BREAK = (int)1;
    public static final int STOP_BREAK = (int)2;
    public static final int GET_UPDATED_BLOCK = (int)3;
    public static final int DROP_ITEM = (int)4;
    public static final int START_SLEEPING = (int)5;
    public static final int STOP_SLEEPING = (int)6;
    public static final int RESPAWN = (int)7;
    public static final int JUMP = (int)8;
    public static final int START_SPRINT = (int)9;
    public static final int STOP_SPRINT = (int)10;
    public static final int START_SNEAK = (int)11;
    public static final int STOP_SNEAK = (int)12;
    public static final int START_GLIDING = (int)15;
    public static final int STOP_GLIDING = (int)16;
    public static final int BUILD_DENIED = (int)17;
    public static final int CONTINUE_BREAK = (int)18;
    public static final int CHANGE_SKIN = (int)19;

    public long entityId;
    public int action;
    public soupply.bedrock150.type.BlockPosition position;
    public int face;

    public PlayerAction()
    {
        this.position = new soupply.bedrock150.type.BlockPosition();
    }

    public PlayerAction(long entityId, int action, soupply.bedrock150.type.BlockPosition position, int face)
    {
        this.entityId = entityId;
        this.action = action;
        this.position = position;
        this.face = face;
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
