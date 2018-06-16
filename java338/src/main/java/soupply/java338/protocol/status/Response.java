package soupply.java338.protocol.status;

import java.util.*;
import soupply.util.*;

public class Response extends soupply.java338.Packet
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
