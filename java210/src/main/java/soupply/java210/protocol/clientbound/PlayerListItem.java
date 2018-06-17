package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class PlayerListItem extends soupply.java210.Packet
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
