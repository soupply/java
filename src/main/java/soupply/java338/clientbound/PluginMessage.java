package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class PluginMessage extends soupply.java338.Packet
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
