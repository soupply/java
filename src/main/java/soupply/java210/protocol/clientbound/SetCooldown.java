package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class SetCooldown extends soupply.java210.Packet
{

    public static final int ID = 23;

    public int item;
    public int cooldown;

    public SetCooldown()
    {
    }

    public SetCooldown(int item, int cooldown)
    {
        this.item = item;
        this.cooldown = cooldown;
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
