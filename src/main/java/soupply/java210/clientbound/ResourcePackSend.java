package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class ResourcePackSend extends soupply.java210.Packet
{

    public String url;
    public String hash;

    public ResourcePackSend()
    {
    }

    public ResourcePackSend(String url, String hash)
    {
        this.url = url;
        this.hash = hash;
    }

}
