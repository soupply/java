package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class AddHangingEntity extends soupply.bedrock150.Packet
{

    public static final int ID = 16;

    public long entityId;
    public long runtimeId;
    public soupply.bedrock150.type.BlockPosition position;
    public int unknown3;

    public AddHangingEntity()
    {
        this.position = new soupply.bedrock150.type.BlockPosition();
    }

    public AddHangingEntity(long entityId, long runtimeId, soupply.bedrock150.type.BlockPosition position, int unknown3)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
