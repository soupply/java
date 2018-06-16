package soupply.java340.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class PlayerDigging extends soupply.java340.Packet
{

    public static final int ID = 20;

    // status
    public static final int START_DIGGING = 0;
    public static final int CANCEL_DIGGING = 1;
    public static final int FINISH_DIGGING = 2;
    public static final int DROP_ITEM_STACK = 3;
    public static final int DROP_ITEM = 4;
    public static final int SHOOT_ARROW = 5;
    public static final int FINISH_EATING = 5;
    public static final int SWAP_ITEM_IN_HAND = 6;

    public int status;
    public long position;
    public byte face;

    public PlayerDigging()
    {
    }

    public PlayerDigging(int status, long position, byte face)
    {
        this.status = status;
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
    public void decodeBody(Buffer buffer)
    {
    }

}
