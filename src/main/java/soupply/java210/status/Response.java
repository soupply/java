package soupply.java210.status;

import java.util.*;
import soupply.util.*;

class Response extends soupply.java210.Packet
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
