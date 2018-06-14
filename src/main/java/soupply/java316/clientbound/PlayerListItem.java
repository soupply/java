package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class PlayerListItem extends soupply.java316.Packet
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
