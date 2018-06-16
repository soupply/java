package soupply.java340.protocol.status;

import java.util.*;
import soupply.util.*;

public class Response extends soupply.java340.Packet
{

    public static final int ID = 0;

    public String json;

    public Response()
    {
    }

    public Response(String json)
    {
        this.json = json;
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
