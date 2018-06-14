package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class ResourcePackSend extends soupply.java335.Packet
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
