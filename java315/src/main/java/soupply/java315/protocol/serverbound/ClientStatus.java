package soupply.java315.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class ClientStatus extends soupply.java315.Packet
{

    public static final int ID = 3;

    // action
    public static final int RESPAWN = (int)0;
    public static final int REQUEST_STATS = (int)1;
    public static final int OPEN_INVENTORY = (int)2;

    public int action;

    public ClientStatus()
    {
    }

    public ClientStatus(int action)
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
