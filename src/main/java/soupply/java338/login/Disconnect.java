package soupply.java338.login;

import java.util.*;
import soupply.util.*;

class Disconnect extends soupply.java338.Packet
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
