package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class RemoveEntityEffect extends soupply.java340.Packet
{

    public static final int ID = 51;

    public int entityId;
    public byte effectId;

    public RemoveEntityEffect()
    {
    }

    public RemoveEntityEffect(int entityId, byte effectId)
    {
        this.entityId = entityId;
        this.effectId = effectId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(entityId);
        _buffer.writeByte(effectId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
        effectId = _buffer.readByte();
    }

    public static RemoveEntityEffect fromBuffer(byte[] buffer)
    {
        RemoveEntityEffect packet = new RemoveEntityEffect();
        packet.safeDecode(buffer);
        return packet;
    }

}
