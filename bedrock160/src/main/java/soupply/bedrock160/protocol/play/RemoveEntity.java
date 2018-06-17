package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class RemoveEntity extends soupply.bedrock160.Packet
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
    }

    public static RemoveEntity fromBuffer(byte[] buffer)
    {
        RemoveEntity packet = new RemoveEntity();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
