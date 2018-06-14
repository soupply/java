package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class SetEntityData extends soupply.bedrock137.Packet
{

    public long entityId;
    public soupply.bedrock137.Metadata metadata;

    public SetEntityData()
    {
    }

    public SetEntityData(long entityId, soupply.bedrock137.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
    }

}
