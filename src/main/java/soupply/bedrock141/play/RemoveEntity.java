package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class RemoveEntity extends soupply.bedrock141.Packet
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
