package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class PlayerListItem extends soupply.java316.Packet
{

    public static final int ID = 45;

    public int action;

    public PlayerListItem()
    {
    }

    public PlayerListItem(int action)
    {
        this.action = action;
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
