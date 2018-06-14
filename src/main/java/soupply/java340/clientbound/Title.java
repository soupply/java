package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class Title extends soupply.java340.Packet
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
