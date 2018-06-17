package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class EntityFall extends soupply.bedrock.Packet
{

    public static final int ID = 37;

    public long entityId;
    public float distance;
    public boolean unknown2;

    public EntityFall()
    {
    }

    public EntityFall(long entityId, float distance, boolean unknown2)
    {
        this.entityId = entityId;
        this.distance = distance;
        this.unknown2 = unknown2;
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
