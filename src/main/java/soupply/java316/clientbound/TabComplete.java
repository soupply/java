package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class TabComplete extends soupply.java316.Packet
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
