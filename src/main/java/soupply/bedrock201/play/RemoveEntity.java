package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class RemoveEntity extends soupply.bedrock201.Packet
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
