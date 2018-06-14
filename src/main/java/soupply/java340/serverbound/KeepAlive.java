package soupply.java340.serverbound;

import java.util.*;
import soupply.util.*;

class KeepAlive extends soupply.java340.Packet
{

    public long id;

    public KeepAlive()
    {
    }

    public KeepAlive(long id)
    {
        this.id = id;
    }

}
