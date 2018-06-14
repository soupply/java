package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class SetHealth extends soupply.bedrock137.Packet
{

    public int health;

    public SetHealth()
    {
    }

    public SetHealth(int health)
    {
        this.health = health;
    }

}
