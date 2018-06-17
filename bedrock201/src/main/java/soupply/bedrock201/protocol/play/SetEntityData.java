package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetEntityData extends soupply.bedrock201.Packet
{

    public static final int ID = 39;

    public long entityId;
    public soupply.bedrock201.Metadata metadata;

    public SetEntityData()
    {
        this.metadata = new soupply.bedrock201.Metadata();
    }

    public SetEntityData(long entityId, soupply.bedrock201.Metadata metadata)
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
