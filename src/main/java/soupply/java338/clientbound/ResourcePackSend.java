package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class ResourcePackSend extends soupply.java338.Packet
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
