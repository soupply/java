package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class DestroyEntities extends soupply.java316.Packet
{

    public int[] entityIds;

    public DestroyEntities()
    {
    }

    public DestroyEntities(int[] entityIds)
    {
        this.entityIds = entityIds;
    }

}
