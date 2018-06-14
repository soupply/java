package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class TabComplete extends soupply.java315.Packet
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
