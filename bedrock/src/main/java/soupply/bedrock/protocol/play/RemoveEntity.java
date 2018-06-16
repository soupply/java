package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class RemoveEntity extends soupply.bedrock.Packet
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
    public void decodeBody(Buffer buffer)
    {
    }

}