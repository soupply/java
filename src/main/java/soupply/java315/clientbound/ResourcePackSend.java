package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class ResourcePackSend extends soupply.java315.Packet
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
