package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class SetEntityData extends soupply.bedrock201.Packet
{

    public long entityId;
    public soupply.bedrock201.Metadata metadata;

    public SetEntityData()
    {
    }

    public SetEntityData(long entityId, soupply.bedrock201.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
    }

}
