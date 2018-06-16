package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class SetEntityData extends soupply.bedrock150.Packet
{

    public static final int ID = 39;

    public long entityId;
    public soupply.bedrock150.Metadata metadata;

    public SetEntityData()
    {
        this.metadata = new soupply.bedrock150.Metadata();
    }

    public SetEntityData(long entityId, soupply.bedrock150.Metadata metadata)
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
