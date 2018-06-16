package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class BossBar extends soupply.java210.Packet
{

    public static final int ID = 12;

    public UUID uuid;
    public int action;

    public BossBar()
    {
        this.uuid = new UUID();
    }

    public BossBar(UUID uuid, int action)
    {
        this.uuid = uuid;
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
