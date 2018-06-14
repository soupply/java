package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class Disconnect extends soupply.java335.Packet
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
