package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class Title extends soupply.java210.Packet
{

    public int action;

    public Title()
    {
    }

    public Title(int action)
    {
        this.action = action;
    }

}
