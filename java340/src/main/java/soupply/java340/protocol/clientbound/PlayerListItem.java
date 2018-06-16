package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class PlayerListItem extends soupply.java340.Packet
{

    public static final int ID = 46;

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
