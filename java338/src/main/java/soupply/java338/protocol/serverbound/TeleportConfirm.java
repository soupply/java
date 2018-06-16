package soupply.java338.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class TeleportConfirm extends soupply.java338.Packet
{

    public static final int ID = 0;

    public int teleportId;

    public TeleportConfirm()
    {
    }

    public TeleportConfirm(int teleportId)
    {
        this.teleportId = teleportId;
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
