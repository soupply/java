package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class PlayerListHeaderAndFooter extends soupply.java338.Packet
{

    public String header;
    public String footer;

    public PlayerListHeaderAndFooter()
    {
    }

    public PlayerListHeaderAndFooter(String header, String footer)
    {
        this.header = header;
        this.footer = footer;
    }

}
