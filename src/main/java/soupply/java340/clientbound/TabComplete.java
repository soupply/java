package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class TabComplete extends soupply.java340.Packet
{

    public String[] matches;

    public TabComplete()
    {
    }

    public TabComplete(String[] matches)
    {
        this.matches = matches;
    }

}
