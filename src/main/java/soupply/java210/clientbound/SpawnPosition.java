package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnPosition extends soupply.java210.Packet
{

    public long position;

    public SpawnPosition()
    {
    }

    public SpawnPosition(long position)
    {
        this.position = position;
    }

}
