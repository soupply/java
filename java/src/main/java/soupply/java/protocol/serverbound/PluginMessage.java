package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class PluginMessage extends soupply.java.Packet
{

    public static final int ID = 9;

    public String channel;
    public byte[] data;

    public PluginMessage()
    {
    }

    public PluginMessage(String channel, byte[] data)
    {
        this.channel = channel;
        this.data = data;
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
