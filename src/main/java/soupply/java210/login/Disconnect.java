package soupply.java210.login;

import java.util.*;
import soupply.util.*;

class Disconnect extends soupply.java210.Packet
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
