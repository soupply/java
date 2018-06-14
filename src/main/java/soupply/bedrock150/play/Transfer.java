package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class Transfer extends soupply.bedrock150.Packet
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
