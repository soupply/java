package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class ResourcePackStatus extends soupply.java.Packet
{

    public static final int ID = 24;

    // result
    public static final int LOADED = 0;
    public static final int DECLINED = 1;
    public static final int FAILED = 2;
    public static final int ACCEPTED = 3;

    public int result;

    public ResourcePackStatus()
    {
    }

    public ResourcePackStatus(int result)
    {
        this.result = result;
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
