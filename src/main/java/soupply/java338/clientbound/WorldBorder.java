package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class WorldBorder extends soupply.java338.Packet
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
