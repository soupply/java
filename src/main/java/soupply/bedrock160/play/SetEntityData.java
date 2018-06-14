package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class SetEntityData extends soupply.bedrock160.Packet
{

    public long entityId;
    public soupply.bedrock160.Metadata metadata;

    public SetEntityData()
    {
    }

    public SetEntityData(long entityId, soupply.bedrock160.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
    }

}
