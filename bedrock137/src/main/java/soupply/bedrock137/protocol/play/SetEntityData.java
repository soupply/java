package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class SetEntityData extends soupply.bedrock137.Packet
{

    public static final int ID = 39;

    public long entityId;
    public soupply.bedrock137.Metadata metadata;

    public SetEntityData()
    {
        this.metadata = new soupply.bedrock137.Metadata();
    }

    public SetEntityData(long entityId, soupply.bedrock137.Metadata metadata)
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
