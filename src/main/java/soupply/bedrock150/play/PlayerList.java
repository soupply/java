package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class PlayerList extends soupply.bedrock150.Packet
{

    public byte action;

    public PlayerList()
    {
    }

    public PlayerList(byte action)
    {
        this.action = action;
    }

}
