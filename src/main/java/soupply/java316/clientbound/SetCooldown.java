package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class SetCooldown extends soupply.java316.Packet
{

    public int item;
    public int cooldown;

    public SetCooldown()
    {
    }

    public SetCooldown(int item, int cooldown)
    {
        this.item = item;
        this.cooldown = cooldown;
    }

}
