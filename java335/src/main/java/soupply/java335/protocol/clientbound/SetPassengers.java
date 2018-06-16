package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class SetPassengers extends soupply.java335.Packet
{

    public static final int ID = 66;

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

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
