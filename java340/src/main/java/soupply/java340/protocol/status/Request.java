package soupply.java340.protocol.status;

import java.util.*;
import soupply.util.*;

class Request extends soupply.java340.Packet
{

    public static final int ID = 0;

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
