package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class Teams extends soupply.java338.Packet
{

    public String name;
    public byte mode;

    public Teams()
    {
    }

    public Teams(String name, byte mode)
    {
        this.name = name;
        this.mode = mode;
    }

}
