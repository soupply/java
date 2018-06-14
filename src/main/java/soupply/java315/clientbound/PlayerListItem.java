package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class PlayerListItem extends soupply.java315.Packet
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
