package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class PlayerListItem extends soupply.java340.Packet
{

    public int action;

    public PlayerListItem()
    {
    }

    public PlayerListItem(int action)
    {
        this.action = action;
    }

}
