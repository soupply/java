package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetEntityData extends soupply.bedrock.Packet
{

    public static final int ID = 39;

    public long entityId;
    public soupply.bedrock.metadata.Metadata metadata;

    public SetEntityData()
    {
        this.metadata = new soupply.bedrock.metadata.Metadata();
    }

    public SetEntityData(long entityId, soupply.bedrock.metadata.Metadata metadata)
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
        metadata.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVarlong();
        metadata.decodeBody(_buffer);
    }

    public static SetEntityData fromBuffer(byte[] buffer)
    {
        SetEntityData packet = new SetEntityData();
        packet.safeDecode(buffer);
        return packet;
    }

}
