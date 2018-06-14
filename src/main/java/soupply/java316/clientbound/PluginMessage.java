package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class PluginMessage extends soupply.java316.Packet
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
