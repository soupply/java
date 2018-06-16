package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class UseItem extends soupply.java.Packet
{

    public static final int ID = 32;

    // hand
    public static final int MAIN_HAND = (int)0;
    public static final int OFF_HAND = (int)1;

    public int hand;

    public UseItem()
    {
    }

    public UseItem(int hand)
    {
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
