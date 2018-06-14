package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class TimeUpdate extends soupply.java340.Packet
{

    public long worldAge;
    public long time;

    public TimeUpdate()
    {
    }

    public TimeUpdate(long worldAge, long time)
    {
        this.worldAge = worldAge;
        this.time = time;
    }

}
