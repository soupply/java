package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class ResourcePackSend extends soupply.java338.Packet
{

    public static final int ID = 52;

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
    public void decodeBody(Buffer buffer)
    {
    }

}
