package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class AddHangingEntity extends soupply.bedrock.Packet
{

    public static final int ID = 16;

    public long entityId;
    public long runtimeId;
    public soupply.bedrock.type.BlockPosition position;
    public int unknown3;

    public AddHangingEntity()
    {
    }

    public AddHangingEntity(long entityId, long runtimeId, soupply.bedrock.type.BlockPosition position, int unknown3)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.position = position;
        this.unknown3 = unknown3;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
