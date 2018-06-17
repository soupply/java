package soupply.java316.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class TeleportConfirm extends soupply.java316.Packet
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
