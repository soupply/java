package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class RemoveEntityEffect extends soupply.java335.Packet
{

    public int entityId;
    public byte effectId;

    public RemoveEntityEffect()
    {
    }

    public RemoveEntityEffect(int entityId, byte effectId)
    {
        this.entityId = entityId;
        this.effectId = effectId;
    }

}
