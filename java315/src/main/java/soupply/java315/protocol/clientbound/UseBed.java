package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class UseBed extends soupply.java315.Packet
{

    public static final int ID = 47;

    public int entityId;
    public long position;

    public UseBed()
    {
    }

    public UseBed(int entityId, long position)
    {
        this.entityId = entityId;
        this.position = position;
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
        _buffer.writeBigEndianLong(position);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
        position = _buffer.readBigEndianLong();
    }

    public static UseBed fromBuffer(byte[] buffer)
    {
        UseBed packet = new UseBed();
        packet.safeDecode(buffer);
        return packet;
    }

}
