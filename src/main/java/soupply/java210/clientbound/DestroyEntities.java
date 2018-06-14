package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class DestroyEntities extends soupply.java210.Packet
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
