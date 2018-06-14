package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class PluginMessage extends soupply.java210.Packet
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
