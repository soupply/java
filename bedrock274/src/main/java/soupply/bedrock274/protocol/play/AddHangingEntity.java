package soupply.bedrock274.protocol.play;

import java.util.*;
import soupply.util.*;

public class AddHangingEntity extends soupply.bedrock274.Packet
{

    public static final int ID = 16;

    public long entityId;
    public long runtimeId;
    public soupply.bedrock274.type.BlockPosition position;
    public int unknown3;

    public AddHangingEntity()
    {
        this.position = new soupply.bedrock274.type.BlockPosition();
    }

    public AddHangingEntity(long entityId, long runtimeId, soupply.bedrock274.type.BlockPosition position, int unknown3)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.position = position;
        this.unknown3 = unknown3;
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
        _buffer.writeVarulong(runtimeId);
        position.encodeBody(_buffer);
        _buffer.writeVarint(unknown3);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVarlong();
        runtimeId = _buffer.readVarulong();
        position.decodeBody(_buffer);
        unknown3 = _buffer.readVarint();
    }

    public static AddHangingEntity fromBuffer(byte[] buffer)
    {
        AddHangingEntity packet = new AddHangingEntity();
        packet.safeDecode(buffer);
        return packet;
    }

}
