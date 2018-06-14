package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class SetEntityData extends soupply.bedrock150.Packet
{

    public long entityId;
    public soupply.bedrock150.Metadata metadata;

    public SetEntityData()
    {
    }

    public SetEntityData(long entityId, soupply.bedrock150.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
    }

}
