package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class AddHangingEntity extends soupply.bedrock150.Packet
{

    public long entityId;
    public long runtimeId;
    public soupply.bedrock150.type.BlockPosition position;
    public int unknown3;

    public AddHangingEntity()
    {
    }

    public AddHangingEntity(long entityId, long runtimeId, soupply.bedrock150.type.BlockPosition position, int unknown3)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.position = position;
        this.unknown3 = unknown3;
    }

}
