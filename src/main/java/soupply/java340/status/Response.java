package soupply.java340.status;

import java.util.*;
import soupply.util.*;

class Response extends soupply.java340.Packet
{

    public String json;

    public Response()
    {
    }

    public Response(String json)
    {
        this.json = json;
    }

}
