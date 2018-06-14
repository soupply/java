package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class Disconnect extends soupply.java340.Packet
{

    public String reason;

    public Disconnect()
    {
    }

    public Disconnect(String reason)
    {
        this.reason = reason;
    }

}
