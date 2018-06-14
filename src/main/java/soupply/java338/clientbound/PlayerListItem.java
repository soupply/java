package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class PlayerListItem extends soupply.java338.Packet
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
