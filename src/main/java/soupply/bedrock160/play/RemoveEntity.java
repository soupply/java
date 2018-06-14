package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class RemoveEntity extends soupply.bedrock160.Packet
{

    public long entityId;

    public RemoveEntity()
    {
    }

    public RemoveEntity(long entityId)
    {
        this.entityId = entityId;
    }

}
