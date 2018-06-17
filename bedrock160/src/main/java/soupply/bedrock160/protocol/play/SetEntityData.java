package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetEntityData extends soupply.bedrock160.Packet
{

    public static final int ID = 39;

    public long entityId;
    public soupply.bedrock160.Metadata metadata;

    public SetEntityData()
    {
        this.metadata = new soupply.bedrock160.Metadata();
    }

    public SetEntityData(long entityId, soupply.bedrock160.Metadata metadata)
    {
        this.entityId = entityId;
        this.metadata = metadata;
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
