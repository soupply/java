package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class ShowStoreOffer extends soupply.bedrock141.Packet
{

    public static final int ID = 91;

    public String unknown0;
    public boolean unknown1;
    public String unknown2;

    public ShowStoreOffer()
    {
    }

    public ShowStoreOffer(String unknown0, boolean unknown1, String unknown2)
    {
        this.unknown0 = unknown0;
        this.unknown1 = unknown1;
        this.unknown2 = unknown2;
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
