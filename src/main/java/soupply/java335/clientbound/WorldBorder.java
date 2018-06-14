package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class WorldBorder extends soupply.java335.Packet
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
