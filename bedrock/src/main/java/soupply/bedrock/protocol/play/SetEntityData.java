package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class SetEntityData extends soupply.bedrock.Packet
{

    public static final int ID = 39;

    public long entityId;
    public soupply.bedrock.Metadata metadata;

    public SetEntityData()
    {
        this.metadata = new soupply.bedrock.Metadata();
    }

    public SetEntityData(long entityId, soupply.bedrock.Metadata metadata)
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
    public void decodeBody(Buffer buffer)
    {
    }

}
