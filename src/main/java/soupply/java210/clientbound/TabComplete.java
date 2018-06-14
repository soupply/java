package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class TabComplete extends soupply.java210.Packet
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
