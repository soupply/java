package soupply.java335.serverbound;

import java.util.*;
import soupply.util.*;

class PluginMessage extends soupply.java335.Packet
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
