package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class DestroyEntities extends soupply.java315.Packet
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
