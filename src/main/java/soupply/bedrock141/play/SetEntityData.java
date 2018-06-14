package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class SetEntityData extends soupply.bedrock141.Packet
{

    public long entityId;
    public soupply.bedrock141.Metadata metadata;

    public SetEntityData()
    {
    }

    public SetEntityData(long entityId, soupply.bedrock141.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
    }

}
