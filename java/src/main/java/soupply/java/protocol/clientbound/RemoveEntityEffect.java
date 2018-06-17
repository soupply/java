package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class RemoveEntityEffect extends soupply.java.Packet
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
        _buffer.writeBigEndianByte(effectId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        effectId = _buffer.readBigEndianByte();
    }

    public static RemoveEntityEffect fromBuffer(byte[] buffer)
    {
        RemoveEntityEffect packet = new RemoveEntityEffect();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
