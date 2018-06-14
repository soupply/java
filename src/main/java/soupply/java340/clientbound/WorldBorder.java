package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class WorldBorder extends soupply.java340.Packet
{

    public int action;

    public WorldBorder()
    {
    }

    public WorldBorder(int action)
    {
        this.action = action;
    }

}
