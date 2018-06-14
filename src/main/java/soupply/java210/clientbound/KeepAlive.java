package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class KeepAlive extends soupply.java210.Packet
{

    public int id;

    public KeepAlive()
    {
    }

    public KeepAlive(int id)
    {
        this.id = id;
    }

}
