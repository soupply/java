package soupply.java340.serverbound;

import java.util.*;
import soupply.util.*;

class PluginMessage extends soupply.java340.Packet
{

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

}
