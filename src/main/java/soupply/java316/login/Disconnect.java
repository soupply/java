package soupply.java316.login;

import java.util.*;
import soupply.util.*;

class Disconnect extends soupply.java316.Packet
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
