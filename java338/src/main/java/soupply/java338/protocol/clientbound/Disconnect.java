package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Disconnect extends soupply.java338.Packet
{

    public static final int ID = 26;

    public String reason;

    public Disconnect()
    {
    }

    public Disconnect(String reason)
    {
        this.reason = reason;
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
