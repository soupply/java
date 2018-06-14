package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class KeepAlive extends soupply.java338.Packet
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
