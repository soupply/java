package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class SetPassengers extends soupply.java338.Packet
{

    public int entityId;
    public int[] passengers;

    public SetPassengers()
    {
    }

    public SetPassengers(int entityId, int[] passengers)
    {
        this.entityId = entityId;
        this.passengers = passengers;
    }

}
