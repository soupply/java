package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class TabComplete extends soupply.java335.Packet
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
