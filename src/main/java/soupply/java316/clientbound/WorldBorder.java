package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class WorldBorder extends soupply.java316.Packet
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
