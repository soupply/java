package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class EntityPickRequest extends soupply.bedrock160.Packet
{

    public long entityType;
    public byte slot;

    public EntityPickRequest()
    {
    }

    public EntityPickRequest(long entityType, byte slot)
    {
        this.entityType = entityType;
        this.slot = slot;
    }

}
