package soupply.java.protocol.login;

import java.util.*;
import soupply.util.*;

public class Disconnect extends soupply.java.Packet
{

    public static final int ID = 0;

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
