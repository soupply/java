package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class SetEntityLink extends soupply.bedrock160.Packet
{

    // action
    public static final byte REMOVE = 0;
    public static final byte ADD = 1;

    public long vehicle;
    public long passenger;
    public byte action;

    public SetEntityLink()
    {
    }

    public SetEntityLink(long vehicle, long passenger, byte action)
    {
        this.vehicle = vehicle;
        this.passenger = passenger;
        this.action = action;
    }

}
