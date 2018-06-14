package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class Transfer extends soupply.bedrock137.Packet
{

    public String ip;
    public short port = 19132;

    public Transfer()
    {
    }

    public Transfer(String ip, short port)
    {
        this.ip = ip;
        this.port = port;
    }

}
