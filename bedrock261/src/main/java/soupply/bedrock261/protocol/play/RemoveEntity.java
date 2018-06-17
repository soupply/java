package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class RemoveEntity extends soupply.bedrock261.Packet
{

    public static final int ID = 14;

    public long entityId;

    public RemoveEntity()
    {
    }

    public RemoveEntity(long entityId)
    {
        this.entityId = entityId;
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
